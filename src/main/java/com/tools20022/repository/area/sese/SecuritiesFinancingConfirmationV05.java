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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesFincgConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmTransactionIdentificationDetails
 * SecuritiesFinancingConfirmationV05.mmTransactionIdentificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmAdditionalParameters
 * SecuritiesFinancingConfirmationV05.mmAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmTradeDetails
 * SecuritiesFinancingConfirmationV05.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmationV05.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmFinancialInstrumentAttributes
 * SecuritiesFinancingConfirmationV05.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmQuantityAndAccountDetails
 * SecuritiesFinancingConfirmationV05.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmSecuritiesFinancingDetails
 * SecuritiesFinancingConfirmationV05.mmSecuritiesFinancingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmStandingSettlementInstructionDetails
 * SecuritiesFinancingConfirmationV05.mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmSettlementParameters
 * SecuritiesFinancingConfirmationV05.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmDeliveringSettlementParties
 * SecuritiesFinancingConfirmationV05.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmReceivingSettlementParties
 * SecuritiesFinancingConfirmationV05.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmCashParties
 * SecuritiesFinancingConfirmationV05.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmSettledAmount
 * SecuritiesFinancingConfirmationV05.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmOtherAmounts
 * SecuritiesFinancingConfirmationV05.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmOtherBusinessParties
 * SecuritiesFinancingConfirmationV05.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05#mmSupplementaryData
 * SecuritiesFinancingConfirmationV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.035.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingConfirmationV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nA securities financing transaction account servicer sends a SecuritiesFinancingConfirmation to an account owner to confirm or advise of the partial or full settlement of the opening or closing leg of a securities financing transaction. \n\nThe account servicer/owner relationship may be:\n\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\n\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or \n\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\n\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06
 * SecuritiesFinancingConfirmationV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04
 * SecuritiesFinancingConfirmationV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesFinancingConfirmationV05", propOrder = {"transactionIdentificationDetails", "additionalParameters", "tradeDetails", "financialInstrumentIdentification", "financialInstrumentAttributes",
		"quantityAndAccountDetails", "securitiesFinancingDetails", "standingSettlementInstructionDetails", "settlementParameters", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settledAmount", "otherAmounts",
		"otherBusinessParties", "supplementaryData"})
public class SecuritiesFinancingConfirmationV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected TransactionTypeAndAdditionalParameters3 transactionIdentificationDetails;
	/**
	 * Securities financing transaction identification information, type
	 * (repurchase agreement, reverse repurchase agreement, securities lending
	 * or securities borrowing) and other parameters.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmTransactionIdentificationDetails
	 * SecuritiesFinancingConfirmationV06.mmTransactionIdentificationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmTransactionIdentificationDetails
	 * SecuritiesFinancingConfirmationV04.mmTransactionIdentificationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentificationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxIdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDetails";
			definition = "Securities financing transaction identification information, type (repurchase agreement, reverse repurchase agreement, securities lending or securities borrowing) and other parameters.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmTransactionIdentificationDetails);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmTransactionIdentificationDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionTypeAndAdditionalParameters3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getTransactionIdentificationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalParameters18 additionalParameters;
	/**
	 * Additional parameters to the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmAdditionalParameters
	 * SecuritiesFinancingConfirmationV06.mmAdditionalParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmAdditionalParameters
	 * SecuritiesFinancingConfirmationV04.mmAdditionalParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Additional parameters to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmAdditionalParameters);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmAdditionalParameters;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalParameters18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getAdditionalParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTradeDetails38 tradeDetails;
	/**
	 * Details of the securities financing deal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38
	 * SecuritiesTradeDetails38}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmTradeDetails
	 * SecuritiesFinancingConfirmationV06.mmTradeDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmTradeDetails
	 * SecuritiesFinancingConfirmationV04.mmTradeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the securities financing deal.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmTradeDetails);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmTradeDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails38.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getTradeDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * Financial instrument representing a sum of rights of the investor
	 * vis-a-vis the issuer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmFinancialInstrumentIdentification
	 * SecuritiesFinancingConfirmationV06.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmFinancialInstrumentIdentification
	 * SecuritiesFinancingConfirmationV04.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmFinancialInstrumentIdentification);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getFinancialInstrumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialInstrumentAttributes35 financialInstrumentAttributes;
	/**
	 * Elements characterising a financial instrument.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmFinancialInstrumentAttributes
	 * SecuritiesFinancingConfirmationV06.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmFinancialInstrumentAttributes
	 * SecuritiesFinancingConfirmationV04.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentAttributes = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmFinancialInstrumentAttributes);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmFinancialInstrumentAttributes;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes35.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getFinancialInstrumentAttributes", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected QuantityAndAccount18 quantityAndAccountDetails;
	/**
	 * Details related to the account and quantity involved in the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmQuantityAndAccountDetails
	 * SecuritiesFinancingConfirmationV06.mmQuantityAndAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmQuantityAndAccountDetails
	 * SecuritiesFinancingConfirmationV04.mmQuantityAndAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQuantityAndAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmQuantityAndAccountDetails);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmQuantityAndAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getQuantityAndAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesFinancingTransactionDetails11 securitiesFinancingDetails;
	/**
	 * Details of the closing of the securities financing transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmSecuritiesFinancingDetails
	 * SecuritiesFinancingConfirmationV06.mmSecuritiesFinancingDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmSecuritiesFinancingDetails
	 * SecuritiesFinancingConfirmationV04.mmSecuritiesFinancingDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecuritiesFinancingDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctiesFincgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingDetails";
			definition = "Details of the closing of the securities financing transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmSecuritiesFinancingDetails);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmSecuritiesFinancingDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getSecuritiesFinancingDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StandingSettlementInstruction3 standingSettlementInstructionDetails;
	/**
	 * Specifies what settlement standing instruction database is to be used to
	 * derive the settlement parties involved in the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmStandingSettlementInstructionDetails
	 * SecuritiesFinancingConfirmationV06.mmStandingSettlementInstructionDetails
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmStandingSettlementInstructionDetails
	 * SecuritiesFinancingConfirmationV04.mmStandingSettlementInstructionDetails
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingSettlementInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmStandingSettlementInstructionDetails);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmStandingSettlementInstructionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getStandingSettlementInstructionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementDetails71 settlementParameters;
	/**
	 * Parameters which explicitly state the conditions that must be fulfilled
	 * before a particular transaction of a financial instrument can be settled.
	 * These parameters are defined by the instructing party in compliance with
	 * settlement rules in the market the transaction will settle in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71
	 * SettlementDetails71}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmSettlementParameters
	 * SecuritiesFinancingConfirmationV06.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmSettlementParameters
	 * SecuritiesFinancingConfirmationV04.mmSettlementParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmSettlementParameters);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmSettlementParameters;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementDetails71.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getSettlementParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementParties10 deliveringSettlementParties;
	/**
	 * Identifies the chain of delivering settlement parties.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmDeliveringSettlementParties
	 * SecuritiesFinancingConfirmationV06.mmDeliveringSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmDeliveringSettlementParties
	 * SecuritiesFinancingConfirmationV04.mmDeliveringSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDeliveringSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmDeliveringSettlementParties);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmDeliveringSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getDeliveringSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementParties10 receivingSettlementParties;
	/**
	 * Identifies the chain of receiving settlement parties.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmReceivingSettlementParties
	 * SecuritiesFinancingConfirmationV06.mmReceivingSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmReceivingSettlementParties
	 * SecuritiesFinancingConfirmationV04.mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReceivingSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmReceivingSettlementParties);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmReceivingSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getReceivingSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashParties17 cashParties;
	/**
	 * Cash parties involved in the transaction if different for the securities
	 * settlement parties.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmCashParties
	 * SecuritiesFinancingConfirmationV06.mmCashParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmCashParties
	 * SecuritiesFinancingConfirmationV04.mmCashParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmCashParties);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmCashParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties17.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getCashParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AmountAndDirection36 settledAmount;
	/**
	 * Amount effectively settled and which will be credited to/debited from the
	 * account owner's cash account. It may differ from the instructed
	 * settlement amount based on market tolerance level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36
	 * AmountAndDirection36}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmSettledAmount
	 * SecuritiesFinancingConfirmationV06.mmSettledAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmSettledAmount
	 * SecuritiesFinancingConfirmationV04.mmSettledAmount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettledAmount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Amount effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmSettledAmount);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmSettledAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection36.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getSettledAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OtherAmounts17 otherAmounts;
	/**
	 * Other amounts than the settlement amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmOtherAmounts
	 * SecuritiesFinancingConfirmationV06.mmOtherAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmOtherAmounts
	 * SecuritiesFinancingConfirmationV04.mmOtherAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmOtherAmounts);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmOtherAmounts;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts17.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getOtherAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OtherParties19 otherBusinessParties;
	/**
	 * Other business parties relevant to the transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmOtherBusinessParties
	 * SecuritiesFinancingConfirmationV06.mmOtherBusinessParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmOtherBusinessParties
	 * SecuritiesFinancingConfirmationV04.mmOtherBusinessParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherBusinessParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmOtherBusinessParties);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmOtherBusinessParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties19.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getOtherBusinessParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV06#mmSupplementaryData
	 * SecuritiesFinancingConfirmationV06.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV04#mmSupplementaryData
	 * SecuritiesFinancingConfirmationV04.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmSupplementaryData);
			previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingConfirmationV05.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingConfirmationV05";
				definition = "Scope\nA securities financing transaction account servicer sends a SecuritiesFinancingConfirmation to an account owner to confirm or advise of the partial or full settlement of the opening or closing leg of a securities financing transaction. \n\nThe account servicer/owner relationship may be:\n\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\n\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or \n\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\n\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingConfirmationV06.mmObject());
				previousVersion_lazy = () -> SecuritiesFinancingConfirmationV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgConf";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmTransactionIdentificationDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmAdditionalParameters, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmFinancialInstrumentIdentification, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmQuantityAndAccountDetails, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmSecuritiesFinancingDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmStandingSettlementInstructionDetails, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmDeliveringSettlementParties, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmReceivingSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmCashParties, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmSettledAmount,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmOtherAmounts, com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "035";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancingConfirmationV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxIdDtls", required = true)
	public TransactionTypeAndAdditionalParameters3 getTransactionIdentificationDetails() {
		return transactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(TransactionTypeAndAdditionalParameters3 transactionIdentificationDetails) {
		this.transactionIdentificationDetails = transactionIdentificationDetails;
	}

	@XmlElement(name = "AddtlParams")
	public AdditionalParameters18 getAdditionalParameters() {
		return additionalParameters;
	}

	public void setAdditionalParameters(AdditionalParameters18 additionalParameters) {
		this.additionalParameters = additionalParameters;
	}

	@XmlElement(name = "TradDtls", required = true)
	public SecuritiesTradeDetails38 getTradeDetails() {
		return tradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails38 tradeDetails) {
		this.tradeDetails = tradeDetails;
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "FinInstrmAttrbts")
	public FinancialInstrumentAttributes35 getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(FinancialInstrumentAttributes35 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
	}

	@XmlElement(name = "QtyAndAcctDtls", required = true)
	public QuantityAndAccount18 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(QuantityAndAccount18 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = quantityAndAccountDetails;
	}

	@XmlElement(name = "SctiesFincgDtls")
	public SecuritiesFinancingTransactionDetails11 getSecuritiesFinancingDetails() {
		return securitiesFinancingDetails;
	}

	public void setSecuritiesFinancingDetails(SecuritiesFinancingTransactionDetails11 securitiesFinancingDetails) {
		this.securitiesFinancingDetails = securitiesFinancingDetails;
	}

	@XmlElement(name = "StgSttlmInstrDtls")
	public StandingSettlementInstruction3 getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(StandingSettlementInstruction3 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
	}

	@XmlElement(name = "SttlmParams")
	public SettlementDetails71 getSettlementParameters() {
		return settlementParameters;
	}

	public void setSettlementParameters(SettlementDetails71 settlementParameters) {
		this.settlementParameters = settlementParameters;
	}

	@XmlElement(name = "DlvrgSttlmPties")
	public SettlementParties10 getDeliveringSettlementParties() {
		return deliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(SettlementParties10 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
	}

	@XmlElement(name = "RcvgSttlmPties")
	public SettlementParties10 getReceivingSettlementParties() {
		return receivingSettlementParties;
	}

	public void setReceivingSettlementParties(SettlementParties10 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
	}

	@XmlElement(name = "CshPties")
	public CashParties17 getCashParties() {
		return cashParties;
	}

	public void setCashParties(CashParties17 cashParties) {
		this.cashParties = cashParties;
	}

	@XmlElement(name = "SttldAmt")
	public AmountAndDirection36 getSettledAmount() {
		return settledAmount;
	}

	public void setSettledAmount(AmountAndDirection36 settledAmount) {
		this.settledAmount = settledAmount;
	}

	@XmlElement(name = "OthrAmts")
	public OtherAmounts17 getOtherAmounts() {
		return otherAmounts;
	}

	public void setOtherAmounts(OtherAmounts17 otherAmounts) {
		this.otherAmounts = otherAmounts;
	}

	@XmlElement(name = "OthrBizPties")
	public OtherParties19 getOtherBusinessParties() {
		return otherBusinessParties;
	}

	public void setOtherBusinessParties(OtherParties19 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.035.05.05")
	static public class Document {
		@XmlElement(name = "SctiesFincgConf", required = true)
		public SecuritiesFinancingConfirmationV05 messageBody;
	}
}