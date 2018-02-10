/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification7Choice;
import com.tools20022.repository.codeset.OptionParty1Code;
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.entity.SubmittingPartyRole;
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.entity.TreasuryTradingParty;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2#mmRole
 * TradePartyIdentification2.mmRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2#mmSubmittingParty
 * TradePartyIdentification2.mmSubmittingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2#mmFundInformation
 * TradePartyIdentification2.mmFundInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2#mmTradeParty
 * TradePartyIdentification2.mmTradeParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradePartyIdentification2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradePartyIdentification2", propOrder = {"role", "submittingParty", "fundInformation", "tradeParty"})
public class TradePartyIdentification2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Role", required = true)
	protected OptionParty1Code role;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionParty1Code
	 * OptionParty1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmBuyerOrSeller
	 * TradePartyRole.mmBuyerOrSeller}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2
	 * TradePartyIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Role"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the party which is the buyer or the seller."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRole = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmBuyerOrSeller;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification2.mmObject();
			isDerived = false;
			xmlTag = "Role";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Role";
			definition = "Specifies the party which is the buyer or the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionParty1Code.mmObject();
		}
	};
	@XmlElement(name = "SubmitgPty", required = true)
	protected BICIdentifier submittingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubmittingPartyRole
	 * SubmittingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2
	 * TradePartyIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that negotiates and executes treasury transactions on behalf of the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubmittingParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SubmittingPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification2.mmObject();
			isDerived = false;
			xmlTag = "SubmitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittingParty";
			definition = "Party that negotiates and executes treasury transactions on behalf of the counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	@XmlElement(name = "FndInf")
	protected FundIdentification1 fundInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundIdentification1
	 * FundIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty#mmInvestmentFund
	 * TreasuryTradingParty.mmInvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2
	 * TradePartyIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the fund which is one of the parties in a treasury trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFundInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TreasuryTradingParty.mmInvestmentFund;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification2.mmObject();
			isDerived = false;
			xmlTag = "FndInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundInformation";
			definition = "Identifies the fund which is one of the parties in a treasury trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundIdentification1.mmObject();
		}
	};
	@XmlElement(name = "TradPty", required = true)
	protected PartyIdentification7Choice tradeParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification7Choice
	 * PartyIdentification7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty
	 * TreasuryTradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification2
	 * TradePartyIdentification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the party which originated a treasury trade. This party may be the same as the submitting party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeParty = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TreasuryTradingParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification2.mmObject();
			isDerived = false;
			xmlTag = "TradPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeParty";
			definition = "Specifies the party which originated a treasury trade. This party may be the same as the submitting party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification7Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradePartyIdentification2.mmRole, com.tools20022.repository.msg.TradePartyIdentification2.mmSubmittingParty,
						com.tools20022.repository.msg.TradePartyIdentification2.mmFundInformation, com.tools20022.repository.msg.TradePartyIdentification2.mmTradeParty);
				trace_lazy = () -> TradePartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradePartyIdentification2";
				definition = "Entity involved in an activity.";
			}
		});
		return mmObject_lazy.get();
	}

	public OptionParty1Code getRole() {
		return role;
	}

	public TradePartyIdentification2 setRole(OptionParty1Code role) {
		this.role = Objects.requireNonNull(role);
		return this;
	}

	public BICIdentifier getSubmittingParty() {
		return submittingParty;
	}

	public TradePartyIdentification2 setSubmittingParty(BICIdentifier submittingParty) {
		this.submittingParty = Objects.requireNonNull(submittingParty);
		return this;
	}

	public Optional<FundIdentification1> getFundInformation() {
		return fundInformation == null ? Optional.empty() : Optional.of(fundInformation);
	}

	public TradePartyIdentification2 setFundInformation(com.tools20022.repository.msg.FundIdentification1 fundInformation) {
		this.fundInformation = fundInformation;
		return this;
	}

	public PartyIdentification7Choice getTradeParty() {
		return tradeParty;
	}

	public TradePartyIdentification2 setTradeParty(PartyIdentification7Choice tradeParty) {
		this.tradeParty = Objects.requireNonNull(tradeParty);
		return this;
	}
}