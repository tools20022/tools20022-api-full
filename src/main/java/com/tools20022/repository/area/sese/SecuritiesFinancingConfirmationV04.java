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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope A securities financing transaction account servicer sends a
 * SecuritiesFinancingConfirmation to an account owner to confirm or advise of
 * the partial or full settlement of the opening or closing leg of a securities
 * financing transaction.
 * 
 * The account servicer/owner relationship may be:
 * 
 * - a central securities depository or another settlement market infrastructure
 * managing securities financing transactions on behalf of their participants
 * 
 * - an agent (sub-custodian) managing securities financing transactions on
 * behalf of their global custodian customer, or
 * 
 * - a custodian managing securities financing transactions on behalf of an
 * investment management institution or a broker/dealer.
 * 
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmTransactionIdentificationDetails
 * SecuritiesFinancingConfirmationV04.mmTransactionIdentificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmAdditionalParameters
 * SecuritiesFinancingConfirmationV04.mmAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmTradeDetails
 * SecuritiesFinancingConfirmationV04.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmationV04.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmFinancialInstrumentAttributes
 * SecuritiesFinancingConfirmationV04.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmQuantityAndAccountDetails
 * SecuritiesFinancingConfirmationV04.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmSecuritiesFinancingDetails
 * SecuritiesFinancingConfirmationV04.mmSecuritiesFinancingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmStandingSettlementInstructionDetails
 * SecuritiesFinancingConfirmationV04.mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmSettlementParameters
 * SecuritiesFinancingConfirmationV04.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmDeliveringSettlementParties
 * SecuritiesFinancingConfirmationV04.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmReceivingSettlementParties
 * SecuritiesFinancingConfirmationV04.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmCashParties
 * SecuritiesFinancingConfirmationV04.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmSettledAmount
 * SecuritiesFinancingConfirmationV04.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmOtherAmounts
 * SecuritiesFinancingConfirmationV04.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmOtherBusinessParties
 * SecuritiesFinancingConfirmationV04.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmSupplementaryData
 * SecuritiesFinancingConfirmationV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesFincgConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.035.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingConfirmationV04
 * ConstraintCoexistenceAmountRule.forSecuritiesFinancingConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#forSecuritiesFinancingConfirmationV04
 * ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingConfirmationV04}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forSecuritiesFinancingConfirmationV04
 * ConstraintCoexistenceIdentificationRule.forSecuritiesFinancingConfirmationV04
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBuyerSSIRule#forSecuritiesFinancingConfirmationV04
 * ConstraintBuyerSSIRule.forSecuritiesFinancingConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSellerSSIRule#forSecuritiesFinancingConfirmationV04
 * ConstraintSellerSSIRule.forSecuritiesFinancingConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule#forSecuritiesFinancingConfirmationV04
 * ConstraintDeliveringDepositoryAndParty1Rule.
 * forSecuritiesFinancingConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule#forSecuritiesFinancingConfirmationV04
 * ConstraintReceivingDepositoryAndParty1Rule.
 * forSecuritiesFinancingConfirmationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettledAmountRule#forSecuritiesFinancingConfirmationV04
 * ConstraintSettledAmountRule.forSecuritiesFinancingConfirmationV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingConfirmationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nA securities financing transaction account servicer sends a SecuritiesFinancingConfirmation to an account owner to confirm or advise of the partial or full settlement of the opening or closing leg of a securities financing transaction. \n\nThe account servicer/owner relationship may be:\n\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\n\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or \n\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\n\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05
 * SecuritiesFinancingConfirmationV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV03
 * SecuritiesFinancingConfirmationV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingConfirmationV04", propOrder = {"transactionIdentificationDetails", "additionalParameters", "tradeDetails", "financialInstrumentIdentification", "financialInstrumentAttributes",
		"quantityAndAccountDetails", "securitiesFinancingDetails", "standingSettlementInstructionDetails", "settlementParameters", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settledAmount", "otherAmounts",
		"otherBusinessParties", "supplementaryData"})
public class SecuritiesFinancingConfirmationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxIdDtls", required = true)
	protected TransactionTypeAndAdditionalParameters3 transactionIdentificationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3
	 * TransactionTypeAndAdditionalParameters3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmTransactionIdentificationDetails
	 * SecuritiesFinancingConfirmationV05.mmTransactionIdentificationDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentificationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxIdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDetails";
			definition = "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmTransactionIdentificationDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionTypeAndAdditionalParameters3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getTransactionIdentificationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AddtlParams")
	protected AdditionalParameters18 additionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters18
	 * AdditionalParameters18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional parameters to the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmAdditionalParameters
	 * SecuritiesFinancingConfirmationV05.mmAdditionalParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Additional parameters to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmAdditionalParameters);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalParameters18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getAdditionalParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails6 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6
	 * SecuritiesTradeDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the securities financing deal."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmTradeDetails
	 * SecuritiesFinancingConfirmationV05.mmTradeDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the securities financing deal.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmTradeDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getTradeDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmFinancialInstrumentIdentification
	 * SecuritiesFinancingConfirmationV05.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmFinancialInstrumentIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getFinancialInstrumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes35 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35
	 * FinancialInstrumentAttributes35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmFinancialInstrumentAttributes
	 * SecuritiesFinancingConfirmationV05.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentAttributes = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmFinancialInstrumentAttributes);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes35.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getFinancialInstrumentAttributes", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected QuantityAndAccount18 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18
	 * QuantityAndAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAndAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAndAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the account and quantity involved in the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmQuantityAndAccountDetails
	 * SecuritiesFinancingConfirmationV05.mmQuantityAndAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQuantityAndAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmQuantityAndAccountDetails);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getQuantityAndAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SctiesFincgDtls")
	protected SecuritiesFinancingTransactionDetails11 securitiesFinancingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails11
	 * SecuritiesFinancingTransactionDetails11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the closing of the securities financing transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmSecuritiesFinancingDetails
	 * SecuritiesFinancingConfirmationV05.mmSecuritiesFinancingDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecuritiesFinancingDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctiesFincgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingDetails";
			definition = "Details of the closing of the securities financing transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmSecuritiesFinancingDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getSecuritiesFinancingDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StgSttlmInstrDtls")
	protected StandingSettlementInstruction3 standingSettlementInstructionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction3
	 * StandingSettlementInstruction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmInstrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmStandingSettlementInstructionDetails
	 * SecuritiesFinancingConfirmationV05.mmStandingSettlementInstructionDetails
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingSettlementInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmStandingSettlementInstructionDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getStandingSettlementInstructionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmParams")
	protected SettlementDetails60 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60
	 * SettlementDetails60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmSettlementParameters
	 * SecuritiesFinancingConfirmationV05.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmSettlementParameters);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementDetails60.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getSettlementParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties10 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10
	 * SettlementParties10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmDeliveringSettlementParties
	 * SecuritiesFinancingConfirmationV05.mmDeliveringSettlementParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDeliveringSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmDeliveringSettlementParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getDeliveringSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties10 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties10
	 * SettlementParties10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmReceivingSettlementParties
	 * SecuritiesFinancingConfirmationV05.mmReceivingSettlementParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReceivingSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmReceivingSettlementParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getReceivingSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties17 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties17
	 * CashParties17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash parties involved in the transaction if different for the securities settlement parties."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmCashParties
	 * SecuritiesFinancingConfirmationV05.mmCashParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmCashParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties17.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getCashParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttldAmt")
	protected AmountAndDirection2 settledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2
	 * AmountAndDirection2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmSettledAmount
	 * SecuritiesFinancingConfirmationV05.mmSettledAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettledAmount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Amount effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmSettledAmount);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getSettledAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts17 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts17
	 * OtherAmounts17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other amounts than the settlement amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmOtherAmounts
	 * SecuritiesFinancingConfirmationV05.mmOtherAmounts}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmOtherAmounts);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts17.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getOtherAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties19 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties19
	 * OtherParties19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties relevant to the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmOtherBusinessParties
	 * SecuritiesFinancingConfirmationV05.mmOtherBusinessParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherBusinessParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmOtherBusinessParties);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties19.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getOtherBusinessParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmSupplementaryData
	 * SecuritiesFinancingConfirmationV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingConfirmationV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.forSecuritiesFinancingConfirmationV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forSecuritiesFinancingConfirmationV04,
						com.tools20022.repository.constraints.ConstraintBuyerSSIRule.forSecuritiesFinancingConfirmationV04, com.tools20022.repository.constraints.ConstraintSellerSSIRule.forSecuritiesFinancingConfirmationV04,
						com.tools20022.repository.constraints.ConstraintDeliveringDepositoryAndParty1Rule.forSecuritiesFinancingConfirmationV04,
						com.tools20022.repository.constraints.ConstraintReceivingDepositoryAndParty1Rule.forSecuritiesFinancingConfirmationV04,
						com.tools20022.repository.constraints.ConstraintSettledAmountRule.forSecuritiesFinancingConfirmationV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingConfirmationV04";
				definition = "Scope\nA securities financing transaction account servicer sends a SecuritiesFinancingConfirmation to an account owner to confirm or advise of the partial or full settlement of the opening or closing leg of a securities financing transaction. \n\nThe account servicer/owner relationship may be:\n\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\n\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or \n\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\n\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV05.mmObject());
				previousVersion_lazy = () -> SecuritiesFinancingConfirmationV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgConf";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmTransactionIdentificationDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmAdditionalParameters, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmFinancialInstrumentIdentification, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmQuantityAndAccountDetails, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmSecuritiesFinancingDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmStandingSettlementInstructionDetails, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmDeliveringSettlementParties, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmReceivingSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmCashParties, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmSettledAmount,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmOtherAmounts, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "035";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancingConfirmationV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionTypeAndAdditionalParameters3 getTransactionIdentificationDetails() {
		return transactionIdentificationDetails;
	}

	public SecuritiesFinancingConfirmationV04 setTransactionIdentificationDetails(TransactionTypeAndAdditionalParameters3 transactionIdentificationDetails) {
		this.transactionIdentificationDetails = Objects.requireNonNull(transactionIdentificationDetails);
		return this;
	}

	public Optional<AdditionalParameters18> getAdditionalParameters() {
		return additionalParameters == null ? Optional.empty() : Optional.of(additionalParameters);
	}

	public SecuritiesFinancingConfirmationV04 setAdditionalParameters(AdditionalParameters18 additionalParameters) {
		this.additionalParameters = additionalParameters;
		return this;
	}

	public SecuritiesTradeDetails6 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesFinancingConfirmationV04 setTradeDetails(SecuritiesTradeDetails6 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesFinancingConfirmationV04 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes35> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesFinancingConfirmationV04 setFinancialInstrumentAttributes(FinancialInstrumentAttributes35 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public QuantityAndAccount18 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesFinancingConfirmationV04 setQuantityAndAccountDetails(QuantityAndAccount18 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public Optional<SecuritiesFinancingTransactionDetails11> getSecuritiesFinancingDetails() {
		return securitiesFinancingDetails == null ? Optional.empty() : Optional.of(securitiesFinancingDetails);
	}

	public SecuritiesFinancingConfirmationV04 setSecuritiesFinancingDetails(SecuritiesFinancingTransactionDetails11 securitiesFinancingDetails) {
		this.securitiesFinancingDetails = securitiesFinancingDetails;
		return this;
	}

	public Optional<StandingSettlementInstruction3> getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails == null ? Optional.empty() : Optional.of(standingSettlementInstructionDetails);
	}

	public SecuritiesFinancingConfirmationV04 setStandingSettlementInstructionDetails(StandingSettlementInstruction3 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
		return this;
	}

	public Optional<SettlementDetails60> getSettlementParameters() {
		return settlementParameters == null ? Optional.empty() : Optional.of(settlementParameters);
	}

	public SecuritiesFinancingConfirmationV04 setSettlementParameters(SettlementDetails60 settlementParameters) {
		this.settlementParameters = settlementParameters;
		return this;
	}

	public Optional<SettlementParties10> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesFinancingConfirmationV04 setDeliveringSettlementParties(SettlementParties10 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties10> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesFinancingConfirmationV04 setReceivingSettlementParties(SettlementParties10 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties17> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesFinancingConfirmationV04 setCashParties(CashParties17 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection2> getSettledAmount() {
		return settledAmount == null ? Optional.empty() : Optional.of(settledAmount);
	}

	public SecuritiesFinancingConfirmationV04 setSettledAmount(AmountAndDirection2 settledAmount) {
		this.settledAmount = settledAmount;
		return this;
	}

	public Optional<OtherAmounts17> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesFinancingConfirmationV04 setOtherAmounts(OtherAmounts17 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties19> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesFinancingConfirmationV04 setOtherBusinessParties(OtherParties19 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesFinancingConfirmationV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.035.001.04")
	static public class Document {
		@XmlElement(name = "SctiesFincgConf", required = true)
		public SecuritiesFinancingConfirmationV04 messageBody;
	}
}