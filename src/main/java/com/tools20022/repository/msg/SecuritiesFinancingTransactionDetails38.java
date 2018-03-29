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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07;
import com.tools20022.repository.choice.LegalFramework3Choice;
import com.tools20022.repository.choice.RateType35Choice;
import com.tools20022.repository.choice.TerminationDate6Choice;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.entity.SecuritiesFinancing;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection21;
import com.tools20022.repository.msg.Rate2;
import com.tools20022.repository.msg.RateName1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the closing of the securities financing transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmSecuritiesFinancingTradeIdentification
 * SecuritiesFinancingTransactionDetails38.
 * mmSecuritiesFinancingTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmClosingLegIdentification
 * SecuritiesFinancingTransactionDetails38.mmClosingLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmTerminationDate
 * SecuritiesFinancingTransactionDetails38.mmTerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmRateType
 * SecuritiesFinancingTransactionDetails38.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmLegalFramework
 * SecuritiesFinancingTransactionDetails38.mmLegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmMaturityDateModification
 * SecuritiesFinancingTransactionDetails38.mmMaturityDateModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmInterestPayment
 * SecuritiesFinancingTransactionDetails38.mmInterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmVariableRateSupport
 * SecuritiesFinancingTransactionDetails38.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmRepurchaseRate
 * SecuritiesFinancingTransactionDetails38.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmTransactionCallDelay
 * SecuritiesFinancingTransactionDetails38.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmAccruedInterestAmount
 * SecuritiesFinancingTransactionDetails38.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmTerminationTransactionAmount
 * SecuritiesFinancingTransactionDetails38.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmSecondLegNarrative
 * SecuritiesFinancingTransactionDetails38.mmSecondLegNarrative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmSecuritiesFinancingDetails
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmSecuritiesFinancingDetails}</li>
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
 * "SecuritiesFinancingTransactionDetails38"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the closing of the securities financing transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29
 * SecuritiesFinancingTransactionDetails29}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingTransactionDetails38", propOrder = {"securitiesFinancingTradeIdentification", "closingLegIdentification", "terminationDate", "rateType", "legalFramework", "maturityDateModification", "interestPayment",
		"variableRateSupport", "repurchaseRate", "transactionCallDelay", "accruedInterestAmount", "terminationTransactionAmount", "secondLegNarrative"})
public class SecuritiesFinancingTransactionDetails38 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesFincgTradId")
	protected Max35Text securitiesFinancingTradeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::REPO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmSecuritiesFinancingTradeIdentification
	 * SecuritiesFinancingTransactionDetails29.
	 * mmSecuritiesFinancingTradeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<Max35Text>> mmSecuritiesFinancingTradeIdentification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTradId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::REPO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTradeIdentification";
			definition = "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many).";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmSecuritiesFinancingTradeIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getSecuritiesFinancingTradeIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<Max35Text> value) {
			obj.setSecuritiesFinancingTradeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsgLegId")
	protected Max35Text closingLegIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::SECO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmClosingLegIdentification
	 * SecuritiesFinancingTransactionDetails29.mmClosingLegIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<Max35Text>> mmClosingLegIdentification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "ClsgLegId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::SECO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingLegIdentification";
			definition = "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf).";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmClosingLegIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getClosingLegIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<Max35Text> value) {
			obj.setClosingLegIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TermntnDt")
	protected TerminationDate6Choice terminationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TerminationDate6Choice
	 * TerminationDate6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
	 * SecuritiesFinancing.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TERM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing date/time or maturity date/time of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails29.mmTerminationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<TerminationDate6Choice>> mmTerminationDate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<TerminationDate6Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "TermntnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TERM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDate";
			definition = "Closing date/time or maturity date/time of the transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmTerminationDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminationDate6Choice.mmObject();
		}

		@Override
		public Optional<TerminationDate6Choice> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getTerminationDate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<TerminationDate6Choice> value) {
			obj.setTerminationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RateTp")
	protected RateType35Choice rateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateType35Choice
	 * RateType35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
	 * InterestCalculation.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RERT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the rate is fixed or variable."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmRateType
	 * SecuritiesFinancingTransactionDetails29.mmRateType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<RateType35Choice>> mmRateType = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<RateType35Choice>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRateType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RERT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the rate is fixed or variable.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmRateType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateType35Choice.mmObject();
		}

		@Override
		public Optional<RateType35Choice> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getRateType();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<RateType35Choice> value) {
			obj.setRateType(value.orElse(null));
		}
	};
	@XmlElement(name = "LglFrmwk")
	protected LegalFramework3Choice legalFramework;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LegalFramework3Choice
	 * LegalFramework3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmLegalFramework
	 * SecuritiesTrade.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglFrmwk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LEGA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal framework of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails29.mmLegalFramework}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<LegalFramework3Choice>> mmLegalFramework = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<LegalFramework3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmLegalFramework;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "LglFrmwk";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LEGA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmLegalFramework;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LegalFramework3Choice.mmObject();
		}

		@Override
		public Optional<LegalFramework3Choice> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getLegalFramework();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<LegalFramework3Choice> value) {
			obj.setLegalFramework(value.orElse(null));
		}
	};
	@XmlElement(name = "MtrtyDtMod")
	protected YesNoIndicator maturityDateModification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmMaturityDateModification
	 * SecuritiesFinancing.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDtMod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LEGA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDateModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the maturity date of the securities financing transaction may be modified."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails29.mmMaturityDateModification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<YesNoIndicator>> mmMaturityDateModification = new MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmMaturityDateModification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDtMod";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LEGA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDateModification";
			definition = "Specifies whether the maturity date of the securities financing transaction may be modified.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmMaturityDateModification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getMaturityDateModification();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<YesNoIndicator> value) {
			obj.setMaturityDateModification(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstPmt")
	protected YesNoIndicator interestPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterestPayment
	 * SecuritiesFinancing.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LEGA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails29.mmInterestPayment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<YesNoIndicator>> mmInterestPayment = new MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmInterestPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LEGA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			definition = "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmInterestPayment;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getInterestPayment();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<YesNoIndicator> value) {
			obj.setInterestPayment(value.orElse(null));
		}
	};
	@XmlElement(name = "VarblRateSpprt")
	protected RateName1 variableRateSupport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RateName1 RateName1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmVariableRateSupport
	 * SecuritiesFinancing.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblRateSpprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::VASU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index or support rate used together with the spread to calculate the\nrepurchase rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails29.mmVariableRateSupport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<RateName1>> mmVariableRateSupport = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<RateName1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmVariableRateSupport;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "VarblRateSpprt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::VASU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the\nrepurchase rate.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmVariableRateSupport;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateName1.mmObject();
		}

		@Override
		public Optional<RateName1> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getVariableRateSupport();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<RateName1> value) {
			obj.setVariableRateSupport(value.orElse(null));
		}
	};
	@XmlElement(name = "RpRate")
	protected Rate2 repurchaseRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseRate
	 * SecuritiesFinancing.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::REPO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate to be used to recalculate the repurchase amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails29.mmRepurchaseRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<Rate2>> mmRepurchaseRate = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<Rate2>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "RpRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::REPO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Rate to be used to recalculate the repurchase amount.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmRepurchaseRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Rate2.mmObject();
		}

		@Override
		public Optional<Rate2> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getRepurchaseRate();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<Rate2> value) {
			obj.setRepurchaseRate(value.orElse(null));
		}
	};
	@XmlElement(name = "TxCallDely")
	protected Exact3NumericText transactionCallDelay;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTransactionCallDelay
	 * SecuritiesFinancing.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCallDely"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99B::CADE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days' notice a counterparty needs for terminating the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails29.mmTransactionCallDelay}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<Exact3NumericText>> mmTransactionCallDelay = new MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<Exact3NumericText>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTransactionCallDelay;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "TxCallDely";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99B::CADE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmTransactionCallDelay;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}

		@Override
		public Optional<Exact3NumericText> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getTransactionCallDelay();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<Exact3NumericText> value) {
			obj.setTransactionCallDelay(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection21 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails29.mmAccruedInterestAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<AmountAndDirection21>> mmAccruedInterestAmount = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<AmountAndDirection21>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmAccruedInterestAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection21.mmObject();
		}

		@Override
		public Optional<AmountAndDirection21> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<AmountAndDirection21> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TermntnTxAmt")
	protected AmountAndDirection21 terminationTransactionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationTransactionAmount
	 * SecuritiesFinancing.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnTxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::TRTE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be settled to terminate the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails29.mmTerminationTransactionAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<AmountAndDirection21>> mmTerminationTransactionAmount = new MMMessageAssociationEnd<SecuritiesFinancingTransactionDetails38, Optional<AmountAndDirection21>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationTransactionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "TermntnTxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmTerminationTransactionAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection21.mmObject();
		}

		@Override
		public Optional<AmountAndDirection21> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getTerminationTransactionAmount();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<AmountAndDirection21> value) {
			obj.setTerminationTransactionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndLegNrrtv")
	protected Max140Text secondLegNarrative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLegNrrtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70C::SECO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLegNarrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the second leg in narrative form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmSecondLegNarrative
	 * SecuritiesFinancingTransactionDetails29.mmSecondLegNarrative}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<Max140Text>> mmSecondLegNarrative = new MMMessageAttribute<SecuritiesFinancingTransactionDetails38, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmObject();
			isDerived = false;
			xmlTag = "ScndLegNrrtv";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70C::SECO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLegNarrative";
			definition = "Provides additional information about the second leg in narrative form.";
			previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmSecondLegNarrative;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(SecuritiesFinancingTransactionDetails38 obj) {
			return obj.getSecondLegNarrative();
		}

		@Override
		public void setValue(SecuritiesFinancingTransactionDetails38 obj, Optional<Max140Text> value) {
			obj.setSecondLegNarrative(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmSecuritiesFinancingTradeIdentification,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmClosingLegIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmTerminationDate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmRateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmLegalFramework,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmMaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmInterestPayment,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmRepurchaseRate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmAccruedInterestAmount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38.mmSecondLegNarrative);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAllegementNotificationV07.mmSecuritiesFinancingDetails);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingTransactionDetails38";
				definition = "Details of the closing of the securities financing transaction.";
				previousVersion_lazy = () -> SecuritiesFinancingTransactionDetails29.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getSecuritiesFinancingTradeIdentification() {
		return securitiesFinancingTradeIdentification == null ? Optional.empty() : Optional.of(securitiesFinancingTradeIdentification);
	}

	public SecuritiesFinancingTransactionDetails38 setSecuritiesFinancingTradeIdentification(Max35Text securitiesFinancingTradeIdentification) {
		this.securitiesFinancingTradeIdentification = securitiesFinancingTradeIdentification;
		return this;
	}

	public Optional<Max35Text> getClosingLegIdentification() {
		return closingLegIdentification == null ? Optional.empty() : Optional.of(closingLegIdentification);
	}

	public SecuritiesFinancingTransactionDetails38 setClosingLegIdentification(Max35Text closingLegIdentification) {
		this.closingLegIdentification = closingLegIdentification;
		return this;
	}

	public Optional<TerminationDate6Choice> getTerminationDate() {
		return terminationDate == null ? Optional.empty() : Optional.of(terminationDate);
	}

	public SecuritiesFinancingTransactionDetails38 setTerminationDate(TerminationDate6Choice terminationDate) {
		this.terminationDate = terminationDate;
		return this;
	}

	public Optional<RateType35Choice> getRateType() {
		return rateType == null ? Optional.empty() : Optional.of(rateType);
	}

	public SecuritiesFinancingTransactionDetails38 setRateType(RateType35Choice rateType) {
		this.rateType = rateType;
		return this;
	}

	public Optional<LegalFramework3Choice> getLegalFramework() {
		return legalFramework == null ? Optional.empty() : Optional.of(legalFramework);
	}

	public SecuritiesFinancingTransactionDetails38 setLegalFramework(LegalFramework3Choice legalFramework) {
		this.legalFramework = legalFramework;
		return this;
	}

	public Optional<YesNoIndicator> getMaturityDateModification() {
		return maturityDateModification == null ? Optional.empty() : Optional.of(maturityDateModification);
	}

	public SecuritiesFinancingTransactionDetails38 setMaturityDateModification(YesNoIndicator maturityDateModification) {
		this.maturityDateModification = maturityDateModification;
		return this;
	}

	public Optional<YesNoIndicator> getInterestPayment() {
		return interestPayment == null ? Optional.empty() : Optional.of(interestPayment);
	}

	public SecuritiesFinancingTransactionDetails38 setInterestPayment(YesNoIndicator interestPayment) {
		this.interestPayment = interestPayment;
		return this;
	}

	public Optional<RateName1> getVariableRateSupport() {
		return variableRateSupport == null ? Optional.empty() : Optional.of(variableRateSupport);
	}

	public SecuritiesFinancingTransactionDetails38 setVariableRateSupport(RateName1 variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
		return this;
	}

	public Optional<Rate2> getRepurchaseRate() {
		return repurchaseRate == null ? Optional.empty() : Optional.of(repurchaseRate);
	}

	public SecuritiesFinancingTransactionDetails38 setRepurchaseRate(Rate2 repurchaseRate) {
		this.repurchaseRate = repurchaseRate;
		return this;
	}

	public Optional<Exact3NumericText> getTransactionCallDelay() {
		return transactionCallDelay == null ? Optional.empty() : Optional.of(transactionCallDelay);
	}

	public SecuritiesFinancingTransactionDetails38 setTransactionCallDelay(Exact3NumericText transactionCallDelay) {
		this.transactionCallDelay = transactionCallDelay;
		return this;
	}

	public Optional<AmountAndDirection21> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public SecuritiesFinancingTransactionDetails38 setAccruedInterestAmount(AmountAndDirection21 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public Optional<AmountAndDirection21> getTerminationTransactionAmount() {
		return terminationTransactionAmount == null ? Optional.empty() : Optional.of(terminationTransactionAmount);
	}

	public SecuritiesFinancingTransactionDetails38 setTerminationTransactionAmount(AmountAndDirection21 terminationTransactionAmount) {
		this.terminationTransactionAmount = terminationTransactionAmount;
		return this;
	}

	public Optional<Max140Text> getSecondLegNarrative() {
		return secondLegNarrative == null ? Optional.empty() : Optional.of(secondLegNarrative);
	}

	public SecuritiesFinancingTransactionDetails38 setSecondLegNarrative(Max140Text secondLegNarrative) {
		this.secondLegNarrative = secondLegNarrative;
		return this;
	}
}