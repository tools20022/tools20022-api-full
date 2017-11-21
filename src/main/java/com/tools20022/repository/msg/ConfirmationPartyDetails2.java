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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.InvestorCapacity3Choice;
import com.tools20022.repository.choice.PartyIdentification32Choice;
import com.tools20022.repository.choice.TradingPartyCapacity1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestorRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parties used for acting parties that apply either to the whole message or to
 * individual sides.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmIdentification
 * ConfirmationPartyDetails2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmAlternateIdentification
 * ConfirmationPartyDetails2.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmProcessingIdentification
 * ConfirmationPartyDetails2.mmProcessingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmAdditionalInformation
 * ConfirmationPartyDetails2.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmInvestorCapacity
 * ConfirmationPartyDetails2.mmInvestorCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2#mmTradingPartyCapacity
 * ConfirmationPartyDetails2.mmTradingPartyCapacity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConfirmationPartyDetails2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parties used for acting parties that apply either to the whole message or to individual sides."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ConfirmationPartyDetails2", propOrder = {"identification", "alternateIdentification", "processingIdentification", "additionalInformation", "investorCapacity", "tradingPartyCapacity"})
public class ConfirmationPartyDetails2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification32Choice identification;
	/**
	 * Unique and unambiguous identifier for an organisation that is allocated
	 * by an institution, eg, Dun &amp; Bradstreet Identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification32Choice
	 * PartyIdentification32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an organisation that is allocated by an institution, eg, Dun &amp; Bradstreet Identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> ConfirmationPartyDetails2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for an organisation that is allocated by an institution, eg, Dun & Bradstreet Identification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification32Choice.mmObject();
		}
	};
	protected AlternatePartyIdentification5 alternateIdentification;
	/**
	 * Alternate identification for a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification5
	 * AlternatePartyIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Alternate identification for a party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlternateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> ConfirmationPartyDetails2.mmObject();
			isDerived = false;
			xmlTag = "AltrnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateIdentification";
			definition = "Alternate identification for a party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AlternatePartyIdentification5.mmObject();
		}
	};
	protected Max35Text processingIdentification;
	/**
	 * Unambiguous identification of the transaction for the party identified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction for the party identified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ConfirmationPartyDetails2.mmObject();
			isDerived = false;
			xmlTag = "PrcgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingIdentification";
			definition = "Unambiguous identification of the transaction for the party identified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyTextInformation5 additionalInformation;
	/**
	 * Provides additional information to a party identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyTextInformation5
	 * PartyTextInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information to a party identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> ConfirmationPartyDetails2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information to a party identification.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyTextInformation5.mmObject();
		}
	};
	protected InvestorCapacity3Choice investorCapacity;
	/**
	 * Capacity of customer placing the order. Primarily used by futures
	 * exchanges to indicate the CTI code (customer type indicator) as required
	 * by the US CFTC (Commodity Futures Trading Commission).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InvestorCapacity3Choice
	 * InvestorCapacity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestorRole#mmCapacity
	 * InvestorRole.mmCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvestorCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestorRole.mmCapacity;
			componentContext_lazy = () -> ConfirmationPartyDetails2.mmObject();
			isDerived = false;
			xmlTag = "InvstrCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorCapacity";
			definition = "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestorCapacity3Choice.mmObject();
		}
	};
	protected TradingPartyCapacity1Choice tradingPartyCapacity;
	/**
	 * Capacity of customer placing the order. Primarily used by futures
	 * exchanges to indicate the CTI code (customer type indicator) as required
	 * by the US CFTC (Commodity Futures Trading Commission).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TradingPartyCapacity1Choice
	 * TradingPartyCapacity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTradingPartyCapacity
	 * TradePartyRole.mmTradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationPartyDetails2
	 * ConfirmationPartyDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPtyCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPartyCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingPartyCapacity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> ConfirmationPartyDetails2.mmObject();
			isDerived = false;
			xmlTag = "TradgPtyCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPartyCapacity";
			definition = "Capacity of customer placing the order. Primarily used by futures exchanges to indicate the CTI code (customer type indicator) as required by the US CFTC (Commodity Futures Trading Commission).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradingPartyCapacity1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ConfirmationPartyDetails2.mmIdentification, ConfirmationPartyDetails2.mmAlternateIdentification, ConfirmationPartyDetails2.mmProcessingIdentification,
						ConfirmationPartyDetails2.mmAdditionalInformation, ConfirmationPartyDetails2.mmInvestorCapacity, ConfirmationPartyDetails2.mmTradingPartyCapacity);
				trace_lazy = () -> TradePartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConfirmationPartyDetails2";
				definition = "Parties used for acting parties that apply either to the whole message or to individual sides.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public PartyIdentification32Choice getIdentification() {
		return identification;
	}

	public void setIdentification(PartyIdentification32Choice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "AltrnId")
	public AlternatePartyIdentification5 getAlternateIdentification() {
		return alternateIdentification;
	}

	public void setAlternateIdentification(com.tools20022.repository.msg.AlternatePartyIdentification5 alternateIdentification) {
		this.alternateIdentification = alternateIdentification;
	}

	@XmlElement(name = "PrcgId")
	public Max35Text getProcessingIdentification() {
		return processingIdentification;
	}

	public void setProcessingIdentification(Max35Text processingIdentification) {
		this.processingIdentification = processingIdentification;
	}

	@XmlElement(name = "AddtlInf")
	public PartyTextInformation5 getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(com.tools20022.repository.msg.PartyTextInformation5 additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "InvstrCpcty")
	public InvestorCapacity3Choice getInvestorCapacity() {
		return investorCapacity;
	}

	public void setInvestorCapacity(InvestorCapacity3Choice investorCapacity) {
		this.investorCapacity = investorCapacity;
	}

	@XmlElement(name = "TradgPtyCpcty")
	public TradingPartyCapacity1Choice getTradingPartyCapacity() {
		return tradingPartyCapacity;
	}

	public void setTradingPartyCapacity(TradingPartyCapacity1Choice tradingPartyCapacity) {
		this.tradingPartyCapacity = tradingPartyCapacity;
	}
}