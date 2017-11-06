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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.BatchTransactionTypeCode;
import com.tools20022.repository.codeset.ExchangePolicyCode;
import com.tools20022.repository.codeset.FinancialCaptureCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Acceptor parameters to be downloaded from the terminal management system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AcceptorConfiguration"
 * src="doc-files/AcceptorConfiguration.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationIdentification
 * AcceptorConfiguration.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmFinancialCapture
 * AcceptorConfiguration.mmFinancialCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmBatchTransferContent
 * AcceptorConfiguration.mmBatchTransferContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmExchangePolicy
 * AcceptorConfiguration.mmExchangePolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmMaximumNumber
 * AcceptorConfiguration.mmMaximumNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmMaximumAmount
 * AcceptorConfiguration.mmMaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmReconciliationByAcquirer
 * AcceptorConfiguration.mmReconciliationByAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTotalsPerCurrency
 * AcceptorConfiguration.mmTotalsPerCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmProtectCardData
 * AcceptorConfiguration.mmProtectCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmRetailerParameters
 * AcceptorConfiguration.mmRetailerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationParameters
 * AcceptorConfiguration.mmApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationVersion
 * AcceptorConfiguration.mmApplicationVersion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmAcceptorConfiguration
 * TerminalManagementSystem.mmAcceptorConfiguration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2#mmCompletionExchange
 * AcquirerProtocolParameters2.mmCompletionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmOnLineTransaction
 * AcquirerProtocolParameters1.mmOnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmOffLineTransaction
 * AcquirerProtocolParameters1.mmOffLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmReconciliationExchange
 * AcquirerProtocolParameters1.mmReconciliationExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent1#mmAcquirerProtocolParameters
 * AcceptorConfigurationContent1.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration1#mmDataSet
 * AcceptorConfiguration1.mmDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4#mmCompletionExchange
 * AcquirerProtocolParameters4.mmCompletionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmOnLineTransaction
 * AcquirerProtocolParameters3.mmOnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmOffLineTransaction
 * AcquirerProtocolParameters3.mmOffLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmReconciliationExchange
 * AcquirerProtocolParameters3.mmReconciliationExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmAcquirerProtocolParameters
 * AcceptorConfigurationContent2.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration2#mmDataSet
 * AcceptorConfiguration2.mmDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmAcquirerProtocolParameters
 * AcceptorConfigurationContent3.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmOnLineTransaction
 * AcquirerProtocolParameters6.mmOnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmOnLineTransaction
 * AcquirerProtocolParameters7.mmOnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#mmAcquirerProtocolParameters
 * AcceptorConfigurationContent4.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmOnLineTransaction
 * AcquirerProtocolParameters9.mmOnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent5#mmAcquirerProtocolParameters
 * AcceptorConfigurationContent5.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmAcquirerProtocolParameters
 * AcceptorConfigurationContent6.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmOnLineTransaction
 * AcquirerProtocolParameters10.mmOnLineTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet2
 * TerminalManagementDataSet2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet1
 * TerminalManagementDataSet1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration1
 * ExchangeConfiguration1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2
 * AcquirerProtocolParameters2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
 * AcquirerProtocolParameters1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ApplicationParameters1
 * ApplicationParameters1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent1
 * AcceptorConfigurationContent1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet3
 * TerminalManagementDataSet3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfiguration1
 * AcceptorConfiguration1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration2
 * ExchangeConfiguration2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration3
 * ExchangeConfiguration3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4
 * AcquirerProtocolParameters4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
 * AcquirerProtocolParameters3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ApplicationParameters2
 * ApplicationParameters2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2
 * AcceptorConfigurationContent2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet6
 * TerminalManagementDataSet6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfiguration2
 * AcceptorConfiguration2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfiguration3
 * AcceptorConfiguration3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet11
 * TerminalManagementDataSet11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3
 * AcceptorConfigurationContent3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration5
 * ExchangeConfiguration5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
 * AcquirerProtocolParameters6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5
 * AcquirerProtocolParameters5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
 * ExchangeConfiguration4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ApplicationParameters3
 * ApplicationParameters3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfiguration4
 * AcceptorConfiguration4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7
 * AcquirerProtocolParameters7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration6
 * ExchangeConfiguration6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8
 * AcquirerProtocolParameters8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeConfiguration7
 * ExchangeConfiguration7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet14
 * TerminalManagementDataSet14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4
 * AcceptorConfigurationContent4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ApplicationParameters4
 * ApplicationParameters4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfiguration5
 * AcceptorConfiguration5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ApplicationParameters5
 * ApplicationParameters5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet19
 * TerminalManagementDataSet19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9
 * AcquirerProtocolParameters9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent5
 * AcceptorConfigurationContent5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfiguration6
 * AcceptorConfiguration6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet20
 * TerminalManagementDataSet20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ApplicationParameters6
 * ApplicationParameters6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6
 * AcceptorConfigurationContent6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
 * AcquirerProtocolParameters10}</li>
 * </ul>
 * </li>
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
 * "AcceptorConfiguration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Acceptor parameters to be downloaded from the terminal management system."</li>
 * </ul>
 */
public class AcceptorConfiguration {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text applicationIdentification;
	/**
	 * Identification of the payment application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmApplicationIdentification
	 * AcquirerProtocolParameters1.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters1#mmApplicationIdentification
	 * ApplicationParameters1.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmApplicationIdentification
	 * AcquirerProtocolParameters3.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters2#mmApplicationIdentification
	 * ApplicationParameters2.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmApplicationIdentification
	 * AcquirerProtocolParameters6.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters3#mmApplicationIdentification
	 * ApplicationParameters3.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmApplicationIdentification
	 * AcquirerProtocolParameters7.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters4#mmApplicationIdentification
	 * ApplicationParameters4.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters5#mmApplicationIdentification
	 * ApplicationParameters5.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmApplicationIdentification
	 * AcquirerProtocolParameters9.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters6#mmApplicationIdentification
	 * ApplicationParameters6.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmApplicationIdentification
	 * AcquirerProtocolParameters10.mmApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the payment application."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmApplicationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters1.mmApplicationIdentification, com.tools20022.repository.msg.ApplicationParameters1.mmApplicationIdentification,
					com.tools20022.repository.msg.AcquirerProtocolParameters3.mmApplicationIdentification, com.tools20022.repository.msg.ApplicationParameters2.mmApplicationIdentification,
					com.tools20022.repository.msg.AcquirerProtocolParameters6.mmApplicationIdentification, com.tools20022.repository.msg.ApplicationParameters3.mmApplicationIdentification,
					com.tools20022.repository.msg.AcquirerProtocolParameters7.mmApplicationIdentification, com.tools20022.repository.msg.ApplicationParameters4.mmApplicationIdentification,
					com.tools20022.repository.msg.ApplicationParameters5.mmApplicationIdentification, com.tools20022.repository.msg.AcquirerProtocolParameters9.mmApplicationIdentification,
					com.tools20022.repository.msg.ApplicationParameters6.mmApplicationIdentification, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmApplicationIdentification);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected FinancialCaptureCode financialCapture;
	/**
	 * Mode for the financial capture of the transaction by the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCaptureCode
	 * FinancialCaptureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2#mmFinancialCapture
	 * AcquirerProtocolParameters2.mmFinancialCapture}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4#mmFinancialCapture
	 * AcquirerProtocolParameters4.mmFinancialCapture}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5#mmFinancialCapture
	 * AcquirerProtocolParameters5.mmFinancialCapture}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#mmFinancialCapture
	 * AcquirerProtocolParameters8.mmFinancialCapture}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mode for the financial capture of the transaction by the acquirer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFinancialCapture = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters2.mmFinancialCapture, com.tools20022.repository.msg.AcquirerProtocolParameters4.mmFinancialCapture,
					com.tools20022.repository.msg.AcquirerProtocolParameters5.mmFinancialCapture, com.tools20022.repository.msg.AcquirerProtocolParameters8.mmFinancialCapture);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialCapture";
			definition = "Mode for the financial capture of the transaction by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCaptureCode.mmObject();
		}
	};
	protected BatchTransactionTypeCode batchTransferContent;
	/**
	 * Types of transaction to include in the batch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BatchTransactionTypeCode
	 * BatchTransactionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2#mmBatchTransfer
	 * AcquirerProtocolParameters2.mmBatchTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmBatchTransferContent
	 * AcquirerProtocolParameters1.mmBatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4#mmBatchTransfer
	 * AcquirerProtocolParameters4.mmBatchTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmBatchTransferContent
	 * AcquirerProtocolParameters3.mmBatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmBatchTransferContent
	 * AcquirerProtocolParameters6.mmBatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5#mmBatchTransfer
	 * AcquirerProtocolParameters5.mmBatchTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmBatchTransferContent
	 * AcquirerProtocolParameters7.mmBatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#mmBatchTransfer
	 * AcquirerProtocolParameters8.mmBatchTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmBatchTransferContent
	 * AcquirerProtocolParameters9.mmBatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmBatchTransferContent
	 * AcquirerProtocolParameters10.mmBatchTransferContent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransferContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Types of transaction to include in the batch."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBatchTransferContent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters2.mmBatchTransfer, com.tools20022.repository.msg.AcquirerProtocolParameters1.mmBatchTransferContent,
					com.tools20022.repository.msg.AcquirerProtocolParameters4.mmBatchTransfer, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmBatchTransferContent,
					com.tools20022.repository.msg.AcquirerProtocolParameters6.mmBatchTransferContent, com.tools20022.repository.msg.AcquirerProtocolParameters5.mmBatchTransfer,
					com.tools20022.repository.msg.AcquirerProtocolParameters7.mmBatchTransferContent, com.tools20022.repository.msg.AcquirerProtocolParameters8.mmBatchTransfer,
					com.tools20022.repository.msg.AcquirerProtocolParameters9.mmBatchTransferContent, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmBatchTransferContent);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BatchTransactionTypeCode.mmObject();
		}
	};
	protected ExchangePolicyCode exchangePolicy;
	/**
	 * Exchange policy between parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode
	 * ExchangePolicyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration1#mmExchangePolicy
	 * ExchangeConfiguration1.mmExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#mmExchangePolicy
	 * ExchangeConfiguration2.mmExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmExchangePolicy
	 * ExchangeConfiguration3.mmExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmExchangePolicy
	 * ExchangeConfiguration5.mmExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmExchangePolicy
	 * ExchangeConfiguration4.mmExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmExchangePolicy
	 * ExchangeConfiguration6.mmExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmExchangePolicy
	 * ExchangeConfiguration7.mmExchangePolicy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangePolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange policy between parties."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExchangePolicy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration1.mmExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration2.mmExchangePolicy,
					com.tools20022.repository.msg.ExchangeConfiguration3.mmExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration5.mmExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration4.mmExchangePolicy,
					com.tools20022.repository.msg.ExchangeConfiguration6.mmExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration7.mmExchangePolicy);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangePolicy";
			definition = "Exchange policy between parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangePolicyCode.mmObject();
		}
	};
	protected Number maximumNumber;
	/**
	 * Maximum number of transactions without exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration1#mmMaximumNumber
	 * ExchangeConfiguration1.mmMaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#mmMaximumNumber
	 * ExchangeConfiguration2.mmMaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmMaximumNumber
	 * ExchangeConfiguration3.mmMaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmMaximumNumber
	 * ExchangeConfiguration5.mmMaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmMaximumNumber
	 * ExchangeConfiguration4.mmMaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmMaximumNumber
	 * ExchangeConfiguration6.mmMaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmMaximumNumber
	 * ExchangeConfiguration7.mmMaximumNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of transactions without exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration1.mmMaximumNumber, com.tools20022.repository.msg.ExchangeConfiguration2.mmMaximumNumber,
					com.tools20022.repository.msg.ExchangeConfiguration3.mmMaximumNumber, com.tools20022.repository.msg.ExchangeConfiguration5.mmMaximumNumber, com.tools20022.repository.msg.ExchangeConfiguration4.mmMaximumNumber,
					com.tools20022.repository.msg.ExchangeConfiguration6.mmMaximumNumber, com.tools20022.repository.msg.ExchangeConfiguration7.mmMaximumNumber);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of transactions without exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount maximumAmount;
	/**
	 * Maximum cumulative amount of the transactions without exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration1#mmMaximumAmount
	 * ExchangeConfiguration1.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#mmMaximumAmount
	 * ExchangeConfiguration2.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#mmMaximumAmount
	 * ExchangeConfiguration3.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#mmMaximumAmount
	 * ExchangeConfiguration5.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#mmMaximumAmount
	 * ExchangeConfiguration4.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#mmMaximumAmount
	 * ExchangeConfiguration6.mmMaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#mmMaximumAmount
	 * ExchangeConfiguration7.mmMaximumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum cumulative amount of the transactions without exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMaximumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration1.mmMaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration2.mmMaximumAmount,
					com.tools20022.repository.msg.ExchangeConfiguration3.mmMaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration5.mmMaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration4.mmMaximumAmount,
					com.tools20022.repository.msg.ExchangeConfiguration6.mmMaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration7.mmMaximumAmount);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum cumulative amount of the transactions without exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected TrueFalseIndicator reconciliationByAcquirer;
	/**
	 * Indicates the reconciliation period is assigned by the acquirer instead
	 * of the acceptor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters1.mmReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters3.mmReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters6.mmReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters7.mmReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters9.mmReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters10.mmReconciliationByAcquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationByAcquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReconciliationByAcquirer = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters1.mmReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmReconciliationByAcquirer,
					com.tools20022.repository.msg.AcquirerProtocolParameters6.mmReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters7.mmReconciliationByAcquirer,
					com.tools20022.repository.msg.AcquirerProtocolParameters9.mmReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmReconciliationByAcquirer);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator totalsPerCurrency;
	/**
	 * Indicates the reconciliation total amounts are computed per currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmTotalsPerCurrency
	 * AcquirerProtocolParameters1.mmTotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmTotalsPerCurrency
	 * AcquirerProtocolParameters3.mmTotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmTotalsPerCurrency
	 * AcquirerProtocolParameters6.mmTotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmTotalsPerCurrency
	 * AcquirerProtocolParameters7.mmTotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmTotalsPerCurrency
	 * AcquirerProtocolParameters9.mmTotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmTotalsPerCurrency
	 * AcquirerProtocolParameters10.mmTotalsPerCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsPerCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation total amounts are computed per currency."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTotalsPerCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters1.mmTotalsPerCurrency, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmTotalsPerCurrency,
					com.tools20022.repository.msg.AcquirerProtocolParameters6.mmTotalsPerCurrency, com.tools20022.repository.msg.AcquirerProtocolParameters7.mmTotalsPerCurrency,
					com.tools20022.repository.msg.AcquirerProtocolParameters9.mmTotalsPerCurrency, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmTotalsPerCurrency);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator protectCardData;
	/**
	 * Indicator to require protection of sensitive card data in messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmProtectCardData
	 * AcquirerProtocolParameters1.mmProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmProtectCardData
	 * AcquirerProtocolParameters3.mmProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmProtectCardData
	 * AcquirerProtocolParameters6.mmProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmProtectCardData
	 * AcquirerProtocolParameters7.mmProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmProtectCardData
	 * AcquirerProtocolParameters9.mmProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmProtectCardData
	 * AcquirerProtocolParameters10.mmProtectCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator to require protection of sensitive card data in messages."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProtectCardData = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters1.mmProtectCardData, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmProtectCardData,
					com.tools20022.repository.msg.AcquirerProtocolParameters6.mmProtectCardData, com.tools20022.repository.msg.AcquirerProtocolParameters7.mmProtectCardData,
					com.tools20022.repository.msg.AcquirerProtocolParameters9.mmProtectCardData, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmProtectCardData);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected Max10000Binary retailerParameters;
	/**
	 * Acceptor parameters dedicated to the retailer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent1#mmMerchantParameters
	 * AcceptorConfigurationContent1.mmMerchantParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmMerchantParameters
	 * AcceptorConfigurationContent2.mmMerchantParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmMerchantParameters
	 * AcceptorConfigurationContent3.mmMerchantParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailerParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor parameters dedicated to the retailer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRetailerParameters = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent1.mmMerchantParameters, com.tools20022.repository.msg.AcceptorConfigurationContent2.mmMerchantParameters,
					com.tools20022.repository.msg.AcceptorConfigurationContent3.mmMerchantParameters);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RetailerParameters";
			definition = "Acceptor parameters dedicated to the retailer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	protected Max10000Binary applicationParameters;
	/**
	 * Configuration parameters attached to the payment application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent1#mmApplicationParameters
	 * AcceptorConfigurationContent1.mmApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmApplicationParameters
	 * AcceptorConfigurationContent2.mmApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmApplicationParameters
	 * AcceptorConfigurationContent3.mmApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#mmApplicationParameters
	 * AcceptorConfigurationContent4.mmApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent5#mmApplicationParameters
	 * AcceptorConfigurationContent5.mmApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmApplicationParameters
	 * AcceptorConfigurationContent6.mmApplicationParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters attached to the payment application."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmApplicationParameters = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent1.mmApplicationParameters, com.tools20022.repository.msg.AcceptorConfigurationContent2.mmApplicationParameters,
					com.tools20022.repository.msg.AcceptorConfigurationContent3.mmApplicationParameters, com.tools20022.repository.msg.AcceptorConfigurationContent4.mmApplicationParameters,
					com.tools20022.repository.msg.AcceptorConfigurationContent5.mmApplicationParameters, com.tools20022.repository.msg.AcceptorConfigurationContent6.mmApplicationParameters);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Configuration parameters attached to the payment application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	protected TerminalManagementSystem terminalManagementSystem;
	/**
	 * Terminal management system for which an acceptor configuration is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmAcceptorConfiguration
	 * TerminalManagementSystem.mmAcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#mmHost
	 * AcquirerProtocolParameters1.mmHost}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent1#mmHostCommunicationParameters
	 * AcceptorConfigurationContent1.mmHostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmHost
	 * AcquirerProtocolParameters3.mmHost}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#mmHostCommunicationParameters
	 * AcceptorConfigurationContent2.mmHostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#mmHostCommunicationParameters
	 * AcceptorConfigurationContent3.mmHostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmHost
	 * AcquirerProtocolParameters6.mmHost}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmHost
	 * AcquirerProtocolParameters7.mmHost}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#mmHostCommunicationParameters
	 * AcceptorConfigurationContent4.mmHostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmHost
	 * AcquirerProtocolParameters9.mmHost}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent5#mmHostCommunicationParameters
	 * AcceptorConfigurationContent5.mmHostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#mmHostCommunicationParameters
	 * AcceptorConfigurationContent6.mmHostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmHost
	 * AcquirerProtocolParameters10.mmHost}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system for which an acceptor configuration is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters1.mmHost, com.tools20022.repository.msg.AcceptorConfigurationContent1.mmHostCommunicationParameters,
					com.tools20022.repository.msg.AcquirerProtocolParameters3.mmHost, com.tools20022.repository.msg.AcceptorConfigurationContent2.mmHostCommunicationParameters,
					com.tools20022.repository.msg.AcceptorConfigurationContent3.mmHostCommunicationParameters, com.tools20022.repository.msg.AcquirerProtocolParameters6.mmHost,
					com.tools20022.repository.msg.AcquirerProtocolParameters7.mmHost, com.tools20022.repository.msg.AcceptorConfigurationContent4.mmHostCommunicationParameters,
					com.tools20022.repository.msg.AcquirerProtocolParameters9.mmHost, com.tools20022.repository.msg.AcceptorConfigurationContent5.mmHostCommunicationParameters,
					com.tools20022.repository.msg.AcceptorConfigurationContent6.mmHostCommunicationParameters, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmHost);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system for which an acceptor configuration is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmAcceptorConfiguration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
		}
	};
	protected Max35Text applicationVersion;
	/**
	 * Version of the application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the application."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmApplicationVersion = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationVersion";
			definition = "Version of the application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfiguration";
				definition = "Acceptor parameters to be downloaded from the terminal management system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.mmAcceptorConfiguration);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters2.mmCompletionExchange, com.tools20022.repository.msg.AcquirerProtocolParameters1.mmOnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters1.mmOffLineTransaction, com.tools20022.repository.msg.AcquirerProtocolParameters1.mmReconciliationExchange,
						com.tools20022.repository.msg.AcceptorConfigurationContent1.mmAcquirerProtocolParameters, com.tools20022.repository.msg.AcceptorConfiguration1.mmDataSet,
						com.tools20022.repository.msg.AcquirerProtocolParameters4.mmCompletionExchange, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmOnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmOffLineTransaction, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmReconciliationExchange,
						com.tools20022.repository.msg.AcceptorConfigurationContent2.mmAcquirerProtocolParameters, com.tools20022.repository.msg.AcceptorConfiguration2.mmDataSet,
						com.tools20022.repository.msg.AcceptorConfigurationContent3.mmAcquirerProtocolParameters, com.tools20022.repository.msg.AcquirerProtocolParameters6.mmOnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters7.mmOnLineTransaction, com.tools20022.repository.msg.AcceptorConfigurationContent4.mmAcquirerProtocolParameters,
						com.tools20022.repository.msg.AcquirerProtocolParameters9.mmOnLineTransaction, com.tools20022.repository.msg.AcceptorConfigurationContent5.mmAcquirerProtocolParameters,
						com.tools20022.repository.msg.AcceptorConfigurationContent6.mmAcquirerProtocolParameters, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmOnLineTransaction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AcceptorConfiguration.mmApplicationIdentification, com.tools20022.repository.entity.AcceptorConfiguration.mmFinancialCapture,
						com.tools20022.repository.entity.AcceptorConfiguration.mmBatchTransferContent, com.tools20022.repository.entity.AcceptorConfiguration.mmExchangePolicy,
						com.tools20022.repository.entity.AcceptorConfiguration.mmMaximumNumber, com.tools20022.repository.entity.AcceptorConfiguration.mmMaximumAmount,
						com.tools20022.repository.entity.AcceptorConfiguration.mmReconciliationByAcquirer, com.tools20022.repository.entity.AcceptorConfiguration.mmTotalsPerCurrency,
						com.tools20022.repository.entity.AcceptorConfiguration.mmProtectCardData, com.tools20022.repository.entity.AcceptorConfiguration.mmRetailerParameters,
						com.tools20022.repository.entity.AcceptorConfiguration.mmApplicationParameters, com.tools20022.repository.entity.AcceptorConfiguration.mmTerminalManagementSystem,
						com.tools20022.repository.entity.AcceptorConfiguration.mmApplicationVersion);
				derivationComponent_lazy = () -> Arrays.asList(TerminalManagementDataSet2.mmObject(), TerminalManagementDataSet1.mmObject(), ExchangeConfiguration1.mmObject(), AcquirerProtocolParameters2.mmObject(),
						AcquirerProtocolParameters1.mmObject(), ApplicationParameters1.mmObject(), AcceptorConfigurationContent1.mmObject(), TerminalManagementDataSet3.mmObject(), AcceptorConfiguration1.mmObject(),
						ExchangeConfiguration2.mmObject(), ExchangeConfiguration3.mmObject(), AcquirerProtocolParameters4.mmObject(), AcquirerProtocolParameters3.mmObject(), ApplicationParameters2.mmObject(),
						AcceptorConfigurationContent2.mmObject(), TerminalManagementDataSet6.mmObject(), AcceptorConfiguration2.mmObject(), AcceptorConfiguration3.mmObject(), TerminalManagementDataSet11.mmObject(),
						AcceptorConfigurationContent3.mmObject(), ExchangeConfiguration5.mmObject(), AcquirerProtocolParameters6.mmObject(), AcquirerProtocolParameters5.mmObject(), ExchangeConfiguration4.mmObject(),
						ApplicationParameters3.mmObject(), AcceptorConfiguration4.mmObject(), AcquirerProtocolParameters7.mmObject(), ExchangeConfiguration6.mmObject(), AcquirerProtocolParameters8.mmObject(),
						ExchangeConfiguration7.mmObject(), TerminalManagementDataSet14.mmObject(), AcceptorConfigurationContent4.mmObject(), ApplicationParameters4.mmObject(), AcceptorConfiguration5.mmObject(),
						ApplicationParameters5.mmObject(), TerminalManagementDataSet19.mmObject(), AcquirerProtocolParameters9.mmObject(), AcceptorConfigurationContent5.mmObject(), AcceptorConfiguration6.mmObject(),
						TerminalManagementDataSet20.mmObject(), ApplicationParameters6.mmObject(), AcceptorConfigurationContent6.mmObject(), AcquirerProtocolParameters10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getApplicationIdentification() {
		return applicationIdentification;
	}

	public void setApplicationIdentification(Max35Text applicationIdentification) {
		this.applicationIdentification = applicationIdentification;
	}

	public FinancialCaptureCode getFinancialCapture() {
		return financialCapture;
	}

	public void setFinancialCapture(FinancialCaptureCode financialCapture) {
		this.financialCapture = financialCapture;
	}

	public BatchTransactionTypeCode getBatchTransferContent() {
		return batchTransferContent;
	}

	public void setBatchTransferContent(BatchTransactionTypeCode batchTransferContent) {
		this.batchTransferContent = batchTransferContent;
	}

	public ExchangePolicyCode getExchangePolicy() {
		return exchangePolicy;
	}

	public void setExchangePolicy(ExchangePolicyCode exchangePolicy) {
		this.exchangePolicy = exchangePolicy;
	}

	public Number getMaximumNumber() {
		return maximumNumber;
	}

	public void setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = maximumNumber;
	}

	public ImpliedCurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(ImpliedCurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	public TrueFalseIndicator getReconciliationByAcquirer() {
		return reconciliationByAcquirer;
	}

	public void setReconciliationByAcquirer(TrueFalseIndicator reconciliationByAcquirer) {
		this.reconciliationByAcquirer = reconciliationByAcquirer;
	}

	public TrueFalseIndicator getTotalsPerCurrency() {
		return totalsPerCurrency;
	}

	public void setTotalsPerCurrency(TrueFalseIndicator totalsPerCurrency) {
		this.totalsPerCurrency = totalsPerCurrency;
	}

	public TrueFalseIndicator getProtectCardData() {
		return protectCardData;
	}

	public void setProtectCardData(TrueFalseIndicator protectCardData) {
		this.protectCardData = protectCardData;
	}

	public Max10000Binary getRetailerParameters() {
		return retailerParameters;
	}

	public void setRetailerParameters(Max10000Binary retailerParameters) {
		this.retailerParameters = retailerParameters;
	}

	public Max10000Binary getApplicationParameters() {
		return applicationParameters;
	}

	public void setApplicationParameters(Max10000Binary applicationParameters) {
		this.applicationParameters = applicationParameters;
	}

	public TerminalManagementSystem getTerminalManagementSystem() {
		return terminalManagementSystem;
	}

	public void setTerminalManagementSystem(com.tools20022.repository.entity.TerminalManagementSystem terminalManagementSystem) {
		this.terminalManagementSystem = terminalManagementSystem;
	}

	public Max35Text getApplicationVersion() {
		return applicationVersion;
	}

	public void setApplicationVersion(Max35Text applicationVersion) {
		this.applicationVersion = applicationVersion;
	}
}