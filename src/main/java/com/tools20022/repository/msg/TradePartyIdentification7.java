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
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01;
import com.tools20022.repository.codeset.OptionParty1Code;
import com.tools20022.repository.codeset.OptionParty3Code;
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.entity.TreasuryTradingParty;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FundIdentification3;
import com.tools20022.repository.msg.PartyIdentification78;
import com.tools20022.repository.msg.PartyIdentificationAndAccount119;
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
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7#mmFundInformation
 * TradePartyIdentification7.mmFundInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7#mmBuyerOrSellerIndicator
 * TradePartyIdentification7.mmBuyerOrSellerIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7#mmInitiatorIndicator
 * TradePartyIdentification7.mmInitiatorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7#mmTradePartyIdentification
 * TradePartyIdentification7.mmTradePartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7#mmSubmittingParty
 * TradePartyIdentification7.mmSubmittingParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmTradingSideIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmCounterpartySideIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceV01.
 * mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01#mmTradingSideIdentification
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01.
 * mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01#mmCounterpartyRoleIdentification
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01.
 * mmCounterpartyRoleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmTradingSideIdentification
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.
 * mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmCounterpartySideIdentification
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.
 * mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmTradingSideIdentification
 * ForeignExchangeTradeCaptureReportV01.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmCounterpartySideIdentification
 * ForeignExchangeTradeCaptureReportV01.mmCounterpartySideIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradePartyIdentification7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradePartyIdentification7", propOrder = {"fundInformation", "buyerOrSellerIndicator", "initiatorIndicator", "tradePartyIdentification", "submittingParty"})
public class TradePartyIdentification7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FndInf")
	protected FundIdentification3 fundInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundIdentification3
	 * FundIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty#mmInvestmentFund
	 * TreasuryTradingParty.mmInvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7
	 * TradePartyIdentification7}</li>
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
	public static final MMMessageAssociationEnd<TradePartyIdentification7, Optional<FundIdentification3>> mmFundInformation = new MMMessageAssociationEnd<TradePartyIdentification7, Optional<FundIdentification3>>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradingParty.mmInvestmentFund;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification7.mmObject();
			isDerived = false;
			xmlTag = "FndInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundInformation";
			definition = "Identifies the fund which is one of the parties in a treasury trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundIdentification3.mmObject();
		}

		@Override
		public Optional<FundIdentification3> getValue(TradePartyIdentification7 obj) {
			return obj.getFundInformation();
		}

		@Override
		public void setValue(TradePartyIdentification7 obj, Optional<FundIdentification3> value) {
			obj.setFundInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "BuyrOrSellrInd", required = true)
	protected OptionParty1Code buyerOrSellerIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7
	 * TradePartyIdentification7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrOrSellrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerOrSellerIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the party which is the buyer or the seller."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradePartyIdentification7, OptionParty1Code> mmBuyerOrSellerIndicator = new MMMessageAttribute<TradePartyIdentification7, OptionParty1Code>() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmBuyerOrSeller;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification7.mmObject();
			isDerived = false;
			xmlTag = "BuyrOrSellrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerOrSellerIndicator";
			definition = "Specifies the party which is the buyer or the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionParty1Code.mmObject();
		}

		@Override
		public OptionParty1Code getValue(TradePartyIdentification7 obj) {
			return obj.getBuyerOrSellerIndicator();
		}

		@Override
		public void setValue(TradePartyIdentification7 obj, OptionParty1Code value) {
			obj.setBuyerOrSellerIndicator(value);
		}
	};
	@XmlElement(name = "InitrInd", required = true)
	protected OptionParty3Code initiatorIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionParty3Code
	 * OptionParty3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7
	 * TradePartyIdentification7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies if a trade party is a taker or a maker."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradePartyIdentification7, OptionParty3Code> mmInitiatorIndicator = new MMMessageAttribute<TradePartyIdentification7, OptionParty3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification7.mmObject();
			isDerived = false;
			xmlTag = "InitrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorIndicator";
			definition = "Specifies if a trade party is a taker or a maker.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionParty3Code.mmObject();
		}

		@Override
		public OptionParty3Code getValue(TradePartyIdentification7 obj) {
			return obj.getInitiatorIndicator();
		}

		@Override
		public void setValue(TradePartyIdentification7 obj, OptionParty3Code value) {
			obj.setInitiatorIndicator(value);
		}
	};
	@XmlElement(name = "TradPtyId", required = true)
	protected PartyIdentification78 tradePartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification78
	 * PartyIdentification78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7
	 * TradePartyIdentification7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePartyIdentification7, PartyIdentification78> mmTradePartyIdentification = new MMMessageAssociationEnd<TradePartyIdentification7, PartyIdentification78>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification7.mmObject();
			isDerived = false;
			xmlTag = "TradPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePartyIdentification";
			definition = "Identification of the party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification78.mmObject();
		}

		@Override
		public PartyIdentification78 getValue(TradePartyIdentification7 obj) {
			return obj.getTradePartyIdentification();
		}

		@Override
		public void setValue(TradePartyIdentification7 obj, PartyIdentification78 value) {
			obj.setTradePartyIdentification(value);
		}
	};
	@XmlElement(name = "SubmitgPty", required = true)
	protected PartyIdentificationAndAccount119 submittingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount119
	 * PartyIdentificationAndAccount119}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7
	 * TradePartyIdentification7}</li>
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
	 * "Specifies the party which submits a treasury trade to a matching system or to a settlement system or to a counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePartyIdentification7, PartyIdentificationAndAccount119> mmSubmittingParty = new MMMessageAssociationEnd<TradePartyIdentification7, PartyIdentificationAndAccount119>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradePartyIdentification7.mmObject();
			isDerived = false;
			xmlTag = "SubmitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittingParty";
			definition = "Specifies the party which submits a treasury trade to a matching system or to a settlement system or to a counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount119.mmObject();
		}

		@Override
		public PartyIdentificationAndAccount119 getValue(TradePartyIdentification7 obj) {
			return obj.getSubmittingParty();
		}

		@Override
		public void setValue(TradePartyIdentification7 obj, PartyIdentificationAndAccount119 value) {
			obj.setSubmittingParty(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradePartyIdentification7.mmFundInformation, com.tools20022.repository.msg.TradePartyIdentification7.mmBuyerOrSellerIndicator,
						com.tools20022.repository.msg.TradePartyIdentification7.mmInitiatorIndicator, com.tools20022.repository.msg.TradePartyIdentification7.mmTradePartyIdentification,
						com.tools20022.repository.msg.TradePartyIdentification7.mmSubmittingParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeConfirmationStatusAdviceV01.mmTradingSideIdentification, ForeignExchangeTradeConfirmationStatusAdviceV01.mmCounterpartySideIdentification,
						ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmTradingSideIdentification, ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmCounterpartyRoleIdentification,
						ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmTradingSideIdentification, ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmCounterpartySideIdentification,
						ForeignExchangeTradeCaptureReportV01.mmTradingSideIdentification, ForeignExchangeTradeCaptureReportV01.mmCounterpartySideIdentification);
				trace_lazy = () -> TradePartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradePartyIdentification7";
				definition = "Entity involved in an activity.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FundIdentification3> getFundInformation() {
		return fundInformation == null ? Optional.empty() : Optional.of(fundInformation);
	}

	public TradePartyIdentification7 setFundInformation(FundIdentification3 fundInformation) {
		this.fundInformation = fundInformation;
		return this;
	}

	public OptionParty1Code getBuyerOrSellerIndicator() {
		return buyerOrSellerIndicator;
	}

	public TradePartyIdentification7 setBuyerOrSellerIndicator(OptionParty1Code buyerOrSellerIndicator) {
		this.buyerOrSellerIndicator = Objects.requireNonNull(buyerOrSellerIndicator);
		return this;
	}

	public OptionParty3Code getInitiatorIndicator() {
		return initiatorIndicator;
	}

	public TradePartyIdentification7 setInitiatorIndicator(OptionParty3Code initiatorIndicator) {
		this.initiatorIndicator = Objects.requireNonNull(initiatorIndicator);
		return this;
	}

	public PartyIdentification78 getTradePartyIdentification() {
		return tradePartyIdentification;
	}

	public TradePartyIdentification7 setTradePartyIdentification(PartyIdentification78 tradePartyIdentification) {
		this.tradePartyIdentification = Objects.requireNonNull(tradePartyIdentification);
		return this;
	}

	public PartyIdentificationAndAccount119 getSubmittingParty() {
		return submittingParty;
	}

	public TradePartyIdentification7 setSubmittingParty(PartyIdentificationAndAccount119 submittingParty) {
		this.submittingParty = Objects.requireNonNull(submittingParty);
		return this;
	}
}