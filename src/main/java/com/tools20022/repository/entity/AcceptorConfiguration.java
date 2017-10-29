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
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ApplicationIdentification
 * AcceptorConfiguration.ApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#FinancialCapture
 * AcceptorConfiguration.FinancialCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#BatchTransferContent
 * AcceptorConfiguration.BatchTransferContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ExchangePolicy
 * AcceptorConfiguration.ExchangePolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#MaximumNumber
 * AcceptorConfiguration.MaximumNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#MaximumAmount
 * AcceptorConfiguration.MaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ReconciliationByAcquirer
 * AcceptorConfiguration.ReconciliationByAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#TotalsPerCurrency
 * AcceptorConfiguration.TotalsPerCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ProtectCardData
 * AcceptorConfiguration.ProtectCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#RetailerParameters
 * AcceptorConfiguration.RetailerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ApplicationParameters
 * AcceptorConfiguration.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#TerminalManagementSystem
 * AcceptorConfiguration.TerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ApplicationVersion
 * AcceptorConfiguration.ApplicationVersion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#AcceptorConfiguration
 * TerminalManagementSystem.AcceptorConfiguration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2#CompletionExchange
 * AcquirerProtocolParameters2.CompletionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#OnLineTransaction
 * AcquirerProtocolParameters1.OnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#OffLineTransaction
 * AcquirerProtocolParameters1.OffLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#ReconciliationExchange
 * AcquirerProtocolParameters1.ReconciliationExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent1#AcquirerProtocolParameters
 * AcceptorConfigurationContent1.AcquirerProtocolParameters}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfiguration1#DataSet
 * AcceptorConfiguration1.DataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4#CompletionExchange
 * AcquirerProtocolParameters4.CompletionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#OnLineTransaction
 * AcquirerProtocolParameters3.OnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#OffLineTransaction
 * AcquirerProtocolParameters3.OffLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#ReconciliationExchange
 * AcquirerProtocolParameters3.ReconciliationExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#AcquirerProtocolParameters
 * AcceptorConfigurationContent2.AcquirerProtocolParameters}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfiguration2#DataSet
 * AcceptorConfiguration2.DataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#AcquirerProtocolParameters
 * AcceptorConfigurationContent3.AcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#OnLineTransaction
 * AcquirerProtocolParameters6.OnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#OnLineTransaction
 * AcquirerProtocolParameters7.OnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#AcquirerProtocolParameters
 * AcceptorConfigurationContent4.AcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#OnLineTransaction
 * AcquirerProtocolParameters9.OnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent5#AcquirerProtocolParameters
 * AcceptorConfigurationContent5.AcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#AcquirerProtocolParameters
 * AcceptorConfigurationContent6.AcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#OnLineTransaction
 * AcquirerProtocolParameters10.OnLineTransaction}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Identification of the payment application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#ApplicationIdentification
	 * AcquirerProtocolParameters1.ApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters1#ApplicationIdentification
	 * ApplicationParameters1.ApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#ApplicationIdentification
	 * AcquirerProtocolParameters3.ApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters2#ApplicationIdentification
	 * ApplicationParameters2.ApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#ApplicationIdentification
	 * AcquirerProtocolParameters6.ApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters3#ApplicationIdentification
	 * ApplicationParameters3.ApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#ApplicationIdentification
	 * AcquirerProtocolParameters7.ApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters4#ApplicationIdentification
	 * ApplicationParameters4.ApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters5#ApplicationIdentification
	 * ApplicationParameters5.ApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#ApplicationIdentification
	 * AcquirerProtocolParameters9.ApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters6#ApplicationIdentification
	 * ApplicationParameters6.ApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#ApplicationIdentification
	 * AcquirerProtocolParameters10.ApplicationIdentification}</li>
	 * </ul>
	 * </li>
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
	 * name} = "ApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the payment application."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ApplicationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters1.ApplicationIdentification, com.tools20022.repository.msg.ApplicationParameters1.ApplicationIdentification,
					com.tools20022.repository.msg.AcquirerProtocolParameters3.ApplicationIdentification, com.tools20022.repository.msg.ApplicationParameters2.ApplicationIdentification,
					com.tools20022.repository.msg.AcquirerProtocolParameters6.ApplicationIdentification, com.tools20022.repository.msg.ApplicationParameters3.ApplicationIdentification,
					com.tools20022.repository.msg.AcquirerProtocolParameters7.ApplicationIdentification, com.tools20022.repository.msg.ApplicationParameters4.ApplicationIdentification,
					com.tools20022.repository.msg.ApplicationParameters5.ApplicationIdentification, com.tools20022.repository.msg.AcquirerProtocolParameters9.ApplicationIdentification,
					com.tools20022.repository.msg.ApplicationParameters6.ApplicationIdentification, com.tools20022.repository.msg.AcquirerProtocolParameters10.ApplicationIdentification);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2#FinancialCapture
	 * AcquirerProtocolParameters2.FinancialCapture}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4#FinancialCapture
	 * AcquirerProtocolParameters4.FinancialCapture}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5#FinancialCapture
	 * AcquirerProtocolParameters5.FinancialCapture}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#FinancialCapture
	 * AcquirerProtocolParameters8.FinancialCapture}</li>
	 * </ul>
	 * </li>
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
	 * name} = "FinancialCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mode for the financial capture of the transaction by the acquirer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialCapture = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters2.FinancialCapture, com.tools20022.repository.msg.AcquirerProtocolParameters4.FinancialCapture,
					com.tools20022.repository.msg.AcquirerProtocolParameters5.FinancialCapture, com.tools20022.repository.msg.AcquirerProtocolParameters8.FinancialCapture);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialCapture";
			definition = "Mode for the financial capture of the transaction by the acquirer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialCaptureCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2#BatchTransfer
	 * AcquirerProtocolParameters2.BatchTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#BatchTransferContent
	 * AcquirerProtocolParameters1.BatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4#BatchTransfer
	 * AcquirerProtocolParameters4.BatchTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#BatchTransferContent
	 * AcquirerProtocolParameters3.BatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#BatchTransferContent
	 * AcquirerProtocolParameters6.BatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5#BatchTransfer
	 * AcquirerProtocolParameters5.BatchTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#BatchTransferContent
	 * AcquirerProtocolParameters7.BatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8#BatchTransfer
	 * AcquirerProtocolParameters8.BatchTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#BatchTransferContent
	 * AcquirerProtocolParameters9.BatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#BatchTransferContent
	 * AcquirerProtocolParameters10.BatchTransferContent}</li>
	 * </ul>
	 * </li>
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
	 * name} = "BatchTransferContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Types of transaction to include in the batch."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BatchTransferContent = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters2.BatchTransfer, com.tools20022.repository.msg.AcquirerProtocolParameters1.BatchTransferContent,
					com.tools20022.repository.msg.AcquirerProtocolParameters4.BatchTransfer, com.tools20022.repository.msg.AcquirerProtocolParameters3.BatchTransferContent,
					com.tools20022.repository.msg.AcquirerProtocolParameters6.BatchTransferContent, com.tools20022.repository.msg.AcquirerProtocolParameters5.BatchTransfer,
					com.tools20022.repository.msg.AcquirerProtocolParameters7.BatchTransferContent, com.tools20022.repository.msg.AcquirerProtocolParameters8.BatchTransfer,
					com.tools20022.repository.msg.AcquirerProtocolParameters9.BatchTransferContent, com.tools20022.repository.msg.AcquirerProtocolParameters10.BatchTransferContent);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BatchTransactionTypeCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration1#ExchangePolicy
	 * ExchangeConfiguration1.ExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#ExchangePolicy
	 * ExchangeConfiguration2.ExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#ExchangePolicy
	 * ExchangeConfiguration3.ExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#ExchangePolicy
	 * ExchangeConfiguration5.ExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#ExchangePolicy
	 * ExchangeConfiguration4.ExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#ExchangePolicy
	 * ExchangeConfiguration6.ExchangePolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#ExchangePolicy
	 * ExchangeConfiguration7.ExchangePolicy}</li>
	 * </ul>
	 * </li>
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
	 * name} = "ExchangePolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange policy between parties."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExchangePolicy = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration1.ExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration2.ExchangePolicy,
					com.tools20022.repository.msg.ExchangeConfiguration3.ExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration5.ExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration4.ExchangePolicy,
					com.tools20022.repository.msg.ExchangeConfiguration6.ExchangePolicy, com.tools20022.repository.msg.ExchangeConfiguration7.ExchangePolicy);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangePolicy";
			definition = "Exchange policy between parties.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExchangePolicyCode.mmObject();
		}
	};
	/**
	 * Maximum number of transactions without exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration1#MaximumNumber
	 * ExchangeConfiguration1.MaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#MaximumNumber
	 * ExchangeConfiguration2.MaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#MaximumNumber
	 * ExchangeConfiguration3.MaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#MaximumNumber
	 * ExchangeConfiguration5.MaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#MaximumNumber
	 * ExchangeConfiguration4.MaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#MaximumNumber
	 * ExchangeConfiguration6.MaximumNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#MaximumNumber
	 * ExchangeConfiguration7.MaximumNumber}</li>
	 * </ul>
	 * </li>
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
	 * name} = "MaximumNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of transactions without exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration1.MaximumNumber, com.tools20022.repository.msg.ExchangeConfiguration2.MaximumNumber,
					com.tools20022.repository.msg.ExchangeConfiguration3.MaximumNumber, com.tools20022.repository.msg.ExchangeConfiguration5.MaximumNumber, com.tools20022.repository.msg.ExchangeConfiguration4.MaximumNumber,
					com.tools20022.repository.msg.ExchangeConfiguration6.MaximumNumber, com.tools20022.repository.msg.ExchangeConfiguration7.MaximumNumber);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of transactions without exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration1#MaximumAmount
	 * ExchangeConfiguration1.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2#MaximumAmount
	 * ExchangeConfiguration2.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration3#MaximumAmount
	 * ExchangeConfiguration3.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration5#MaximumAmount
	 * ExchangeConfiguration5.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4#MaximumAmount
	 * ExchangeConfiguration4.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6#MaximumAmount
	 * ExchangeConfiguration6.MaximumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeConfiguration7#MaximumAmount
	 * ExchangeConfiguration7.MaximumAmount}</li>
	 * </ul>
	 * </li>
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
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum cumulative amount of the transactions without exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeConfiguration1.MaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration2.MaximumAmount,
					com.tools20022.repository.msg.ExchangeConfiguration3.MaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration5.MaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration4.MaximumAmount,
					com.tools20022.repository.msg.ExchangeConfiguration6.MaximumAmount, com.tools20022.repository.msg.ExchangeConfiguration7.MaximumAmount);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum cumulative amount of the transactions without exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#ReconciliationByAcquirer
	 * AcquirerProtocolParameters1.ReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#ReconciliationByAcquirer
	 * AcquirerProtocolParameters3.ReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#ReconciliationByAcquirer
	 * AcquirerProtocolParameters6.ReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#ReconciliationByAcquirer
	 * AcquirerProtocolParameters7.ReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#ReconciliationByAcquirer
	 * AcquirerProtocolParameters9.ReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#ReconciliationByAcquirer
	 * AcquirerProtocolParameters10.ReconciliationByAcquirer}</li>
	 * </ul>
	 * </li>
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
	 * name} = "ReconciliationByAcquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReconciliationByAcquirer = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters1.ReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters3.ReconciliationByAcquirer,
					com.tools20022.repository.msg.AcquirerProtocolParameters6.ReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters7.ReconciliationByAcquirer,
					com.tools20022.repository.msg.AcquirerProtocolParameters9.ReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters10.ReconciliationByAcquirer);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#TotalsPerCurrency
	 * AcquirerProtocolParameters1.TotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#TotalsPerCurrency
	 * AcquirerProtocolParameters3.TotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#TotalsPerCurrency
	 * AcquirerProtocolParameters6.TotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#TotalsPerCurrency
	 * AcquirerProtocolParameters7.TotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#TotalsPerCurrency
	 * AcquirerProtocolParameters9.TotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#TotalsPerCurrency
	 * AcquirerProtocolParameters10.TotalsPerCurrency}</li>
	 * </ul>
	 * </li>
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
	 * name} = "TotalsPerCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation total amounts are computed per currency."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalsPerCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters1.TotalsPerCurrency, com.tools20022.repository.msg.AcquirerProtocolParameters3.TotalsPerCurrency,
					com.tools20022.repository.msg.AcquirerProtocolParameters6.TotalsPerCurrency, com.tools20022.repository.msg.AcquirerProtocolParameters7.TotalsPerCurrency,
					com.tools20022.repository.msg.AcquirerProtocolParameters9.TotalsPerCurrency, com.tools20022.repository.msg.AcquirerProtocolParameters10.TotalsPerCurrency);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#ProtectCardData
	 * AcquirerProtocolParameters1.ProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#ProtectCardData
	 * AcquirerProtocolParameters3.ProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#ProtectCardData
	 * AcquirerProtocolParameters6.ProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#ProtectCardData
	 * AcquirerProtocolParameters7.ProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#ProtectCardData
	 * AcquirerProtocolParameters9.ProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#ProtectCardData
	 * AcquirerProtocolParameters10.ProtectCardData}</li>
	 * </ul>
	 * </li>
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
	 * name} = "ProtectCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator to require protection of sensitive card data in messages."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProtectCardData = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters1.ProtectCardData, com.tools20022.repository.msg.AcquirerProtocolParameters3.ProtectCardData,
					com.tools20022.repository.msg.AcquirerProtocolParameters6.ProtectCardData, com.tools20022.repository.msg.AcquirerProtocolParameters7.ProtectCardData,
					com.tools20022.repository.msg.AcquirerProtocolParameters9.ProtectCardData, com.tools20022.repository.msg.AcquirerProtocolParameters10.ProtectCardData);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent1#MerchantParameters
	 * AcceptorConfigurationContent1.MerchantParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#MerchantParameters
	 * AcceptorConfigurationContent2.MerchantParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#MerchantParameters
	 * AcceptorConfigurationContent3.MerchantParameters}</li>
	 * </ul>
	 * </li>
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
	 * name} = "RetailerParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor parameters dedicated to the retailer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RetailerParameters = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent1.MerchantParameters, com.tools20022.repository.msg.AcceptorConfigurationContent2.MerchantParameters,
					com.tools20022.repository.msg.AcceptorConfigurationContent3.MerchantParameters);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RetailerParameters";
			definition = "Acceptor parameters dedicated to the retailer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent1#ApplicationParameters
	 * AcceptorConfigurationContent1.ApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#ApplicationParameters
	 * AcceptorConfigurationContent2.ApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#ApplicationParameters
	 * AcceptorConfigurationContent3.ApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#ApplicationParameters
	 * AcceptorConfigurationContent4.ApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent5#ApplicationParameters
	 * AcceptorConfigurationContent5.ApplicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#ApplicationParameters
	 * AcceptorConfigurationContent6.ApplicationParameters}</li>
	 * </ul>
	 * </li>
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
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters attached to the payment application."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ApplicationParameters = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorConfigurationContent1.ApplicationParameters, com.tools20022.repository.msg.AcceptorConfigurationContent2.ApplicationParameters,
					com.tools20022.repository.msg.AcceptorConfigurationContent3.ApplicationParameters, com.tools20022.repository.msg.AcceptorConfigurationContent4.ApplicationParameters,
					com.tools20022.repository.msg.AcceptorConfigurationContent5.ApplicationParameters, com.tools20022.repository.msg.AcceptorConfigurationContent6.ApplicationParameters);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Configuration parameters attached to the payment application.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	/**
	 * Terminal management system for which an acceptor configuration is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#AcceptorConfiguration
	 * TerminalManagementSystem.AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1#Host
	 * AcquirerProtocolParameters1.Host}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent1#HostCommunicationParameters
	 * AcceptorConfigurationContent1.HostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#Host
	 * AcquirerProtocolParameters3.Host}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent2#HostCommunicationParameters
	 * AcceptorConfigurationContent2.HostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent3#HostCommunicationParameters
	 * AcceptorConfigurationContent3.HostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#Host
	 * AcquirerProtocolParameters6.Host}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#Host
	 * AcquirerProtocolParameters7.Host}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent4#HostCommunicationParameters
	 * AcceptorConfigurationContent4.HostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#Host
	 * AcquirerProtocolParameters9.Host}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent5#HostCommunicationParameters
	 * AcceptorConfigurationContent5.HostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent6#HostCommunicationParameters
	 * AcceptorConfigurationContent6.HostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#Host
	 * AcquirerProtocolParameters10.Host}</li>
	 * </ul>
	 * </li>
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
	 * name} = "TerminalManagementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system for which an acceptor configuration is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters1.Host, com.tools20022.repository.msg.AcceptorConfigurationContent1.HostCommunicationParameters,
					com.tools20022.repository.msg.AcquirerProtocolParameters3.Host, com.tools20022.repository.msg.AcceptorConfigurationContent2.HostCommunicationParameters,
					com.tools20022.repository.msg.AcceptorConfigurationContent3.HostCommunicationParameters, com.tools20022.repository.msg.AcquirerProtocolParameters6.Host, com.tools20022.repository.msg.AcquirerProtocolParameters7.Host,
					com.tools20022.repository.msg.AcceptorConfigurationContent4.HostCommunicationParameters, com.tools20022.repository.msg.AcquirerProtocolParameters9.Host,
					com.tools20022.repository.msg.AcceptorConfigurationContent5.HostCommunicationParameters, com.tools20022.repository.msg.AcceptorConfigurationContent6.HostCommunicationParameters,
					com.tools20022.repository.msg.AcquirerProtocolParameters10.Host);
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system for which an acceptor configuration is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.AcceptorConfiguration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute ApplicationVersion = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationVersion";
			definition = "Version of the application.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfiguration";
				definition = "Acceptor parameters to be downloaded from the terminal management system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.AcceptorConfiguration);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters2.CompletionExchange, com.tools20022.repository.msg.AcquirerProtocolParameters1.OnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters1.OffLineTransaction, com.tools20022.repository.msg.AcquirerProtocolParameters1.ReconciliationExchange,
						com.tools20022.repository.msg.AcceptorConfigurationContent1.AcquirerProtocolParameters, com.tools20022.repository.msg.AcceptorConfiguration1.DataSet,
						com.tools20022.repository.msg.AcquirerProtocolParameters4.CompletionExchange, com.tools20022.repository.msg.AcquirerProtocolParameters3.OnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.OffLineTransaction, com.tools20022.repository.msg.AcquirerProtocolParameters3.ReconciliationExchange,
						com.tools20022.repository.msg.AcceptorConfigurationContent2.AcquirerProtocolParameters, com.tools20022.repository.msg.AcceptorConfiguration2.DataSet,
						com.tools20022.repository.msg.AcceptorConfigurationContent3.AcquirerProtocolParameters, com.tools20022.repository.msg.AcquirerProtocolParameters6.OnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters7.OnLineTransaction, com.tools20022.repository.msg.AcceptorConfigurationContent4.AcquirerProtocolParameters,
						com.tools20022.repository.msg.AcquirerProtocolParameters9.OnLineTransaction, com.tools20022.repository.msg.AcceptorConfigurationContent5.AcquirerProtocolParameters,
						com.tools20022.repository.msg.AcceptorConfigurationContent6.AcquirerProtocolParameters, com.tools20022.repository.msg.AcquirerProtocolParameters10.OnLineTransaction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AcceptorConfiguration.ApplicationIdentification, com.tools20022.repository.entity.AcceptorConfiguration.FinancialCapture,
						com.tools20022.repository.entity.AcceptorConfiguration.BatchTransferContent, com.tools20022.repository.entity.AcceptorConfiguration.ExchangePolicy,
						com.tools20022.repository.entity.AcceptorConfiguration.MaximumNumber, com.tools20022.repository.entity.AcceptorConfiguration.MaximumAmount,
						com.tools20022.repository.entity.AcceptorConfiguration.ReconciliationByAcquirer, com.tools20022.repository.entity.AcceptorConfiguration.TotalsPerCurrency,
						com.tools20022.repository.entity.AcceptorConfiguration.ProtectCardData, com.tools20022.repository.entity.AcceptorConfiguration.RetailerParameters,
						com.tools20022.repository.entity.AcceptorConfiguration.ApplicationParameters, com.tools20022.repository.entity.AcceptorConfiguration.TerminalManagementSystem,
						com.tools20022.repository.entity.AcceptorConfiguration.ApplicationVersion);
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
}