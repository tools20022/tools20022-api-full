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
import com.tools20022.repository.area.SecuritiesSettlementLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion;
import com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends a SecuritiesSettlementTransactionConfirmation to an
 * account owner to confirm the partial or full delivery or receipt of financial
 * instruments, free or against of payment, physically or by book-entry.<br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * acting on behalf of their participants<br>
 * - an agent (sub-custodian) acting on behalf of their global custodian
 * customer, or<br>
 * - a custodian acting on behalf of an investment management institution or a
 * broker/dealer.<br>
 * <br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent,<br>
 * - provide a third party with a copy of a message for information,<br>
 * - re-send to a third party a copy of a message for information.<br>
 * using the relevant elements in the Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion
 * SettlementAndReconciliationISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017
 * SettlementandReconciliationMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmTransactionIdentificationDetails
 * SecuritiesSettlementTransactionConfirmationV07.
 * mmTransactionIdentificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmLinkages
 * SecuritiesSettlementTransactionConfirmationV07.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmAdditionalParameters
 * SecuritiesSettlementTransactionConfirmationV07.mmAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmTradeDetails
 * SecuritiesSettlementTransactionConfirmationV07.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmationV07.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionConfirmationV07.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionConfirmationV07.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmSettlementParameters
 * SecuritiesSettlementTransactionConfirmationV07.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionConfirmationV07.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionConfirmationV07.mmDeliveringSettlementParties}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionConfirmationV07.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmCashParties
 * SecuritiesSettlementTransactionConfirmationV07.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmSettledAmount
 * SecuritiesSettlementTransactionConfirmationV07.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmOtherAmounts
 * SecuritiesSettlementTransactionConfirmationV07.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmOtherBusinessParties
 * SecuritiesSettlementTransactionConfirmationV07.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionConfirmationV07.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07#mmSupplementaryData
 * SecuritiesSettlementTransactionConfirmationV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.025.001.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionConfirmationV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a SecuritiesSettlementTransactionConfirmation to an account owner to confirm the partial or full delivery or receipt of financial instruments, free or against of payment, physically or by book-entry.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information.\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06
 * SecuritiesSettlementTransactionConfirmationV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesSettlementTransactionConfirmationV07", propOrder = {"transactionIdentificationDetails", "linkages", "additionalParameters", "tradeDetails", "financialInstrumentIdentification", "financialInstrumentAttributes",
		"quantityAndAccountDetails", "settlementParameters", "standingSettlementInstructionDetails", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settledAmount", "otherAmounts", "otherBusinessParties",
		"additionalPhysicalOrRegistrationDetails", "supplementaryData"})
public class SecuritiesSettlementTransactionConfirmationV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected SettlementTypeAndIdentification19 transactionIdentificationDetails;
	/**
	 * Provides transaction type and identification information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19
	 * SettlementTypeAndIdentification19}</li>
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
	 * definition} = "Provides transaction type and identification information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmTransactionIdentificationDetails
	 * SecuritiesSettlementTransactionConfirmationV06.
	 * mmTransactionIdentificationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentificationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxIdDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationDetails";
			definition = "Provides transaction type and identification information.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmTransactionIdentificationDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementTypeAndIdentification19.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getTransactionIdentificationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Linkages41 linkages;
	/**
	 * Link to another transaction - provided for information only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages41
	 * Linkages41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction - provided for information only."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmLinkages
	 * SecuritiesSettlementTransactionConfirmationV06.mmLinkages}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmLinkages = new MMMessageBuildingBlock() {
		{
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction - provided for information only.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmLinkages;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Linkages41.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getLinkages", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalParameters29 additionalParameters;
	/**
	 * Additional parameters to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29
	 * AdditionalParameters29}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmAdditionalParameters
	 * SecuritiesSettlementTransactionConfirmationV06.mmAdditionalParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Additional parameters to the transaction.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmAdditionalParameters;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalParameters29.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getAdditionalParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesTradeDetails53 tradeDetails;
	/**
	 * Details of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53
	 * SecuritiesTradeDetails53}</li>
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
	 * definition} = "Details of the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmTradeDetails
	 * SecuritiesSettlementTransactionConfirmationV06.mmTradeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the trade.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmTradeDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails53.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getTradeDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * Financial instrument representing a sum of rights of the investor
	 * vis-a-vis the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmFinancialInstrumentIdentification
	 * SecuritiesSettlementTransactionConfirmationV06.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification19.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getFinancialInstrumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialInstrumentAttributes64 financialInstrumentAttributes;
	/**
	 * Elements characterising a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmFinancialInstrumentAttributes
	 * SecuritiesSettlementTransactionConfirmationV06.
	 * mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentAttributes = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmFinancialInstrumentAttributes;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes64.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getFinancialInstrumentAttributes", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected QuantityAndAccount41 quantityAndAccountDetails;
	/**
	 * Details related to the account and quantity involved in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41
	 * QuantityAndAccount41}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmQuantityAndAccountDetails
	 * SecuritiesSettlementTransactionConfirmationV06.
	 * mmQuantityAndAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQuantityAndAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmQuantityAndAccountDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount41.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getQuantityAndAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementDetails128 settlementParameters;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128
	 * SettlementDetails128}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmSettlementParameters
	 * SecuritiesSettlementTransactionConfirmationV06.mmSettlementParameters}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmSettlementParameters;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementDetails128.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getSettlementParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StandingSettlementInstruction11 standingSettlementInstructionDetails;
	/**
	 * Specifies what settlement standing instruction database is to be used to
	 * derive the settlement parties involved in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11
	 * StandingSettlementInstruction11}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmStandingSettlementInstructionDetails
	 * SecuritiesSettlementTransactionConfirmationV06.
	 * mmStandingSettlementInstructionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingSettlementInstructionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmStandingSettlementInstructionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getStandingSettlementInstructionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementParties36 deliveringSettlementParties;
	/**
	 * Identifies the chain of delivering settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmDeliveringSettlementParties
	 * SecuritiesSettlementTransactionConfirmationV06.
	 * mmDeliveringSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDeliveringSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmDeliveringSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties36.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getDeliveringSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementParties36 receivingSettlementParties;
	/**
	 * Identifies the chain of receiving settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmReceivingSettlementParties
	 * SecuritiesSettlementTransactionConfirmationV06.
	 * mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReceivingSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmReceivingSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties36.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getReceivingSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashParties26 cashParties;
	/**
	 * Cash parties involved in the transaction if different for the securities
	 * settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties26
	 * CashParties26}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmCashParties
	 * SecuritiesSettlementTransactionConfirmationV06.mmCashParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmCashParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties26.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getCashParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AmountAndDirection46 settledAmount;
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46
	 * AmountAndDirection46}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmSettledAmount
	 * SecuritiesSettlementTransactionConfirmationV06.mmSettledAmount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettledAmount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Amount effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmSettledAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection46.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getSettledAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OtherAmounts30 otherAmounts;
	/**
	 * Other amounts than the settlement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts30
	 * OtherAmounts30}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmOtherAmounts
	 * SecuritiesSettlementTransactionConfirmationV06.mmOtherAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmOtherAmounts;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts30.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getOtherAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OtherParties27 otherBusinessParties;
	/**
	 * Other business parties relevant to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties27
	 * OtherParties27}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmOtherBusinessParties
	 * SecuritiesSettlementTransactionConfirmationV06.mmOtherBusinessParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherBusinessParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmOtherBusinessParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties27.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getOtherBusinessParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RegistrationParameters4 additionalPhysicalOrRegistrationDetails;
	/**
	 * Provides information required for the registration or physical
	 * settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4
	 * RegistrationParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPhysOrRegnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information required for the registration or physical settlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmAdditionalPhysicalOrRegistrationDetails
	 * SecuritiesSettlementTransactionConfirmationV06.
	 * mmAdditionalPhysicalOrRegistrationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalPhysicalOrRegistrationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlPhysOrRegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetails";
			definition = "Provides information required for the registration or physical settlement.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmAdditionalPhysicalOrRegistrationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegistrationParameters4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getAdditionalPhysicalOrRegistrationDetails", new Class[]{});
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV06#mmSupplementaryData
	 * SecuritiesSettlementTransactionConfirmationV06.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionConfirmationV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionConfirmationV07";
				definition = "Scope\r\nAn account servicer sends a SecuritiesSettlementTransactionConfirmation to an account owner to confirm the partial or full delivery or receipt of financial instruments, free or against of payment, physically or by book-entry.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information.\r\nusing the relevant elements in the Business Application Header.";
				previousVersion_lazy = () -> SecuritiesSettlementTransactionConfirmationV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOLatestversion.mmObject(), SettlementandReconciliationMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxConf";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmTransactionIdentificationDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmLinkages, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmAdditionalParameters,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmQuantityAndAccountDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmStandingSettlementInstructionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmDeliveringSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmReceivingSettlementParties, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmCashParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmSettledAmount, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmOtherAmounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmAdditionalPhysicalOrRegistrationDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "025";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionConfirmationV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxIdDtls", required = true)
	public SettlementTypeAndIdentification19 getTransactionIdentificationDetails() {
		return transactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(SettlementTypeAndIdentification19 transactionIdentificationDetails) {
		this.transactionIdentificationDetails = transactionIdentificationDetails;
	}

	@XmlElement(name = "Lnkgs")
	public Linkages41 getLinkages() {
		return linkages;
	}

	public void setLinkages(Linkages41 linkages) {
		this.linkages = linkages;
	}

	@XmlElement(name = "AddtlParams")
	public AdditionalParameters29 getAdditionalParameters() {
		return additionalParameters;
	}

	public void setAdditionalParameters(AdditionalParameters29 additionalParameters) {
		this.additionalParameters = additionalParameters;
	}

	@XmlElement(name = "TradDtls", required = true)
	public SecuritiesTradeDetails53 getTradeDetails() {
		return tradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails53 tradeDetails) {
		this.tradeDetails = tradeDetails;
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "FinInstrmAttrbts")
	public FinancialInstrumentAttributes64 getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(FinancialInstrumentAttributes64 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
	}

	@XmlElement(name = "QtyAndAcctDtls", required = true)
	public QuantityAndAccount41 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(QuantityAndAccount41 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = quantityAndAccountDetails;
	}

	@XmlElement(name = "SttlmParams", required = true)
	public SettlementDetails128 getSettlementParameters() {
		return settlementParameters;
	}

	public void setSettlementParameters(SettlementDetails128 settlementParameters) {
		this.settlementParameters = settlementParameters;
	}

	@XmlElement(name = "StgSttlmInstrDtls")
	public StandingSettlementInstruction11 getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(StandingSettlementInstruction11 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
	}

	@XmlElement(name = "DlvrgSttlmPties")
	public SettlementParties36 getDeliveringSettlementParties() {
		return deliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(SettlementParties36 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
	}

	@XmlElement(name = "RcvgSttlmPties")
	public SettlementParties36 getReceivingSettlementParties() {
		return receivingSettlementParties;
	}

	public void setReceivingSettlementParties(SettlementParties36 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
	}

	@XmlElement(name = "CshPties")
	public CashParties26 getCashParties() {
		return cashParties;
	}

	public void setCashParties(CashParties26 cashParties) {
		this.cashParties = cashParties;
	}

	@XmlElement(name = "SttldAmt")
	public AmountAndDirection46 getSettledAmount() {
		return settledAmount;
	}

	public void setSettledAmount(AmountAndDirection46 settledAmount) {
		this.settledAmount = settledAmount;
	}

	@XmlElement(name = "OthrAmts")
	public OtherAmounts30 getOtherAmounts() {
		return otherAmounts;
	}

	public void setOtherAmounts(OtherAmounts30 otherAmounts) {
		this.otherAmounts = otherAmounts;
	}

	@XmlElement(name = "OthrBizPties")
	public OtherParties27 getOtherBusinessParties() {
		return otherBusinessParties;
	}

	public void setOtherBusinessParties(OtherParties27 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
	}

	@XmlElement(name = "AddtlPhysOrRegnDtls")
	public RegistrationParameters4 getAdditionalPhysicalOrRegistrationDetails() {
		return additionalPhysicalOrRegistrationDetails;
	}

	public void setAdditionalPhysicalOrRegistrationDetails(RegistrationParameters4 additionalPhysicalOrRegistrationDetails) {
		this.additionalPhysicalOrRegistrationDetails = additionalPhysicalOrRegistrationDetails;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:sese.025.07.07")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxConf", required = true)
		public SecuritiesSettlementTransactionConfirmationV07 messageBody;
	}
}