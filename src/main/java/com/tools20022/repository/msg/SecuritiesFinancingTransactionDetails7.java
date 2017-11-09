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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04;
import com.tools20022.repository.choice.LegalFramework1Choice;
import com.tools20022.repository.choice.RateType5Choice;
import com.tools20022.repository.choice.TerminationDate2Choice;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.entity.SecuritiesFinancing;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

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
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmSecuritiesFinancingTradeIdentification
 * SecuritiesFinancingTransactionDetails7.
 * mmSecuritiesFinancingTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmClosingLegIdentification
 * SecuritiesFinancingTransactionDetails7.mmClosingLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmTerminationDate
 * SecuritiesFinancingTransactionDetails7.mmTerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmRateType
 * SecuritiesFinancingTransactionDetails7.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmLegalFramework
 * SecuritiesFinancingTransactionDetails7.mmLegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmMaturityDateModification
 * SecuritiesFinancingTransactionDetails7.mmMaturityDateModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmInterestPayment
 * SecuritiesFinancingTransactionDetails7.mmInterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmVariableRateSupport
 * SecuritiesFinancingTransactionDetails7.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmRepurchaseRate
 * SecuritiesFinancingTransactionDetails7.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmTransactionCallDelay
 * SecuritiesFinancingTransactionDetails7.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmAccruedInterestAmount
 * SecuritiesFinancingTransactionDetails7.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmTerminationTransactionAmount
 * SecuritiesFinancingTransactionDetails7.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7#mmSecondLegNarrative
 * SecuritiesFinancingTransactionDetails7.mmSecondLegNarrative}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV02#mmSecuritiesFinancingDetails
 * SecuritiesSettlementTransactionAllegementNotificationV02.
 * mmSecuritiesFinancingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV03#mmSecuritiesFinancingDetails
 * SecuritiesSettlementTransactionAllegementNotificationV03.
 * mmSecuritiesFinancingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV04#mmSecuritiesFinancingDetails
 * SecuritiesSettlementTransactionAllegementNotificationV04.
 * mmSecuritiesFinancingDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingTransactionDetails7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the closing of the securities financing transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29
 * SecuritiesFinancingTransactionDetails29}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class SecuritiesFinancingTransactionDetails7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text securitiesFinancingTradeIdentification;
	/**
	 * Unambiguous identification of the underlying securities financing trade
	 * as assigned by the instructing party. The identification is common to all
	 * collateral pieces (one or many).
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTradId"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmSecuritiesFinancingTradeIdentification
	 * SecuritiesFinancingTransactionDetails29.
	 * mmSecuritiesFinancingTradeIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesFinancingTradeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTradeIdentification";
			definition = "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmSecuritiesFinancingTradeIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text closingLegIdentification;
	/**
	 * Unambiguous identification of the second leg of the transaction as known
	 * by the account owner (or the instructing party acting on its behalf).
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgLegId"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmClosingLegIdentification
	 * SecuritiesFinancingTransactionDetails29.mmClosingLegIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingLegIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "ClsgLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingLegIdentification";
			definition = "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmClosingLegIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected TerminationDate2Choice terminationDate;
	/**
	 * Closing date/time or maturity date/time of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TerminationDate2Choice
	 * TerminationDate2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
	 * SecuritiesFinancing.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDt"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmTerminationDate
	 * SecuritiesFinancingTransactionDetails29.mmTerminationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationDateTime;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "TermntnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDate";
			definition = "Closing date/time or maturity date/time of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmTerminationDate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminationDate2Choice.mmObject();
		}
	};
	protected RateType5Choice rateType;
	/**
	 * Specifies whether the rate is fixed or variable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateType5Choice
	 * RateType5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
	 * InterestCalculation.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the rate is fixed or variable."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmRateType
	 * SecuritiesFinancingTransactionDetails29.mmRateType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRateType;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the rate is fixed or variable.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmRateType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateType5Choice.mmObject();
		}
	};
	protected LegalFramework1Choice legalFramework;
	/**
	 * Legal framework of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LegalFramework1Choice
	 * LegalFramework1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmLegalFramework
	 * SecuritiesTrade.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglFrmwk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal framework of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmLegalFramework
	 * SecuritiesFinancingTransactionDetails29.mmLegalFramework}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalFramework = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmLegalFramework;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "LglFrmwk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmLegalFramework);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LegalFramework1Choice.mmObject();
		}
	};
	protected YesNoIndicator maturityDateModification;
	/**
	 * Specifies whether the maturity date of the securities financing
	 * transaction may be modified.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDtMod"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmMaturityDateModification
	 * SecuritiesFinancingTransactionDetails29.mmMaturityDateModification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDateModification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmMaturityDateModification;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDtMod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDateModification";
			definition = "Specifies whether the maturity date of the securities financing transaction may be modified.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmMaturityDateModification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator interestPayment;
	/**
	 * Specifies whether the interest is to be paid to the collateral taker. If
	 * set to no, the interest is paid to the collateral giver.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmt"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmInterestPayment
	 * SecuritiesFinancingTransactionDetails29.mmInterestPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPayment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmInterestPayment;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			definition = "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmInterestPayment);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected RateName1 variableRateSupport;
	/**
	 * Index or support rate used together with the spread to calculate the
	 * repurchase rate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblRateSpprt"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmVariableRateSupport
	 * SecuritiesFinancingTransactionDetails29.mmVariableRateSupport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVariableRateSupport = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmVariableRateSupport;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "VarblRateSpprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the\nrepurchase rate.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmVariableRateSupport);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RateName1.mmObject();
		}
	};
	protected Rate2 repurchaseRate;
	/**
	 * Rate to be used to recalculate the repurchase amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate to be used to recalculate the repurchase amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmRepurchaseRate
	 * SecuritiesFinancingTransactionDetails29.mmRepurchaseRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepurchaseRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseRate;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "RpRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Rate to be used to recalculate the repurchase amount.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmRepurchaseRate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected Exact3NumericText transactionCallDelay;
	/**
	 * Minimum number of days' notice a counterparty needs for terminating the
	 * transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCallDely"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmTransactionCallDelay
	 * SecuritiesFinancingTransactionDetails29.mmTransactionCallDelay}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionCallDelay = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTransactionCallDelay;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "TxCallDely";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmTransactionCallDelay);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected AmountAndDirection4 accruedInterestAmount;
	/**
	 * Interest amount that has accrued in between coupon payment periods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection4
	 * AmountAndDirection4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails29.mmAccruedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccruedInterestAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmAccruedInterestAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection4.mmObject();
		}
	};
	protected AmountAndDirection4 terminationTransactionAmount;
	/**
	 * Total amount of money to be settled to terminate the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection4
	 * AmountAndDirection4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationTransactionAmount
	 * SecuritiesFinancing.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnTxAmt"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmTerminationTransactionAmount
	 * SecuritiesFinancingTransactionDetails29.mmTerminationTransactionAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminationTransactionAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationTransactionAmount;
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "TermntnTxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmTerminationTransactionAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection4.mmObject();
		}
	};
	protected Max140Text secondLegNarrative;
	/**
	 * Provides additional information about the second leg in narrative form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails7
	 * SecuritiesFinancingTransactionDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLegNrrtv"</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails29#mmSecondLegNarrative
	 * SecuritiesFinancingTransactionDetails29.mmSecondLegNarrative}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondLegNarrative = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesFinancingTransactionDetails7.mmObject();
			isDerived = false;
			xmlTag = "ScndLegNrrtv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLegNarrative";
			definition = "Provides additional information about the second leg in narrative form.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmSecondLegNarrative);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails7.mmSecuritiesFinancingTradeIdentification, SecuritiesFinancingTransactionDetails7.mmClosingLegIdentification,
						SecuritiesFinancingTransactionDetails7.mmTerminationDate, SecuritiesFinancingTransactionDetails7.mmRateType, SecuritiesFinancingTransactionDetails7.mmLegalFramework,
						SecuritiesFinancingTransactionDetails7.mmMaturityDateModification, SecuritiesFinancingTransactionDetails7.mmInterestPayment, SecuritiesFinancingTransactionDetails7.mmVariableRateSupport,
						SecuritiesFinancingTransactionDetails7.mmRepurchaseRate, SecuritiesFinancingTransactionDetails7.mmTransactionCallDelay, SecuritiesFinancingTransactionDetails7.mmAccruedInterestAmount,
						SecuritiesFinancingTransactionDetails7.mmTerminationTransactionAmount, SecuritiesFinancingTransactionDetails7.mmSecondLegNarrative);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionAllegementNotificationV02.mmSecuritiesFinancingDetails, SecuritiesSettlementTransactionAllegementNotificationV03.mmSecuritiesFinancingDetails,
						SecuritiesSettlementTransactionAllegementNotificationV04.mmSecuritiesFinancingDetails);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesFinancingTransactionDetails7";
				definition = "Details of the closing of the securities financing transaction.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails29.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getSecuritiesFinancingTradeIdentification() {
		return securitiesFinancingTradeIdentification;
	}

	public void setSecuritiesFinancingTradeIdentification(Max35Text securitiesFinancingTradeIdentification) {
		this.securitiesFinancingTradeIdentification = securitiesFinancingTradeIdentification;
	}

	public Max35Text getClosingLegIdentification() {
		return closingLegIdentification;
	}

	public void setClosingLegIdentification(Max35Text closingLegIdentification) {
		this.closingLegIdentification = closingLegIdentification;
	}

	public TerminationDate2Choice getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(TerminationDate2Choice terminationDate) {
		this.terminationDate = terminationDate;
	}

	public RateType5Choice getRateType() {
		return rateType;
	}

	public void setRateType(RateType5Choice rateType) {
		this.rateType = rateType;
	}

	public LegalFramework1Choice getLegalFramework() {
		return legalFramework;
	}

	public void setLegalFramework(LegalFramework1Choice legalFramework) {
		this.legalFramework = legalFramework;
	}

	public YesNoIndicator getMaturityDateModification() {
		return maturityDateModification;
	}

	public void setMaturityDateModification(YesNoIndicator maturityDateModification) {
		this.maturityDateModification = maturityDateModification;
	}

	public YesNoIndicator getInterestPayment() {
		return interestPayment;
	}

	public void setInterestPayment(YesNoIndicator interestPayment) {
		this.interestPayment = interestPayment;
	}

	public RateName1 getVariableRateSupport() {
		return variableRateSupport;
	}

	public void setVariableRateSupport(com.tools20022.repository.msg.RateName1 variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
	}

	public Rate2 getRepurchaseRate() {
		return repurchaseRate;
	}

	public void setRepurchaseRate(com.tools20022.repository.msg.Rate2 repurchaseRate) {
		this.repurchaseRate = repurchaseRate;
	}

	public Exact3NumericText getTransactionCallDelay() {
		return transactionCallDelay;
	}

	public void setTransactionCallDelay(Exact3NumericText transactionCallDelay) {
		this.transactionCallDelay = transactionCallDelay;
	}

	public AmountAndDirection4 getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection4 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	public AmountAndDirection4 getTerminationTransactionAmount() {
		return terminationTransactionAmount;
	}

	public void setTerminationTransactionAmount(com.tools20022.repository.msg.AmountAndDirection4 terminationTransactionAmount) {
		this.terminationTransactionAmount = terminationTransactionAmount;
	}

	public Max140Text getSecondLegNarrative() {
		return secondLegNarrative;
	}

	public void setSecondLegNarrative(Max140Text secondLegNarrative) {
		this.secondLegNarrative = secondLegNarrative;
	}
}