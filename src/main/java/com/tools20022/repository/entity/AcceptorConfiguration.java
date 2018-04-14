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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.BatchTransactionTypeCode;
import com.tools20022.repository.codeset.ExchangePolicyCode;
import com.tools20022.repository.codeset.FinancialCaptureCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmAcquirerProtocolParameters
 * AcceptorConfigurationContent7.mmAcquirerProtocolParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmOnLineTransaction
 * AcquirerProtocolParameters11.mmOnLineTransaction}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfiguration7
 * AcceptorConfiguration7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ApplicationParameters7
 * ApplicationParameters7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet23
 * TerminalManagementDataSet23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7
 * AcceptorConfigurationContent7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11
 * AcquirerProtocolParameters11}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorConfiguration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Acceptor parameters to be downloaded from the terminal management system."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class AcceptorConfiguration {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text applicationIdentification;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ApplicationParameters7#mmApplicationIdentification
	 * ApplicationParameters7.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmApplicationIdentification
	 * AcquirerProtocolParameters11.mmApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the payment application."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, Max35Text> mmApplicationIdentification = new MMBusinessAttribute<AcceptorConfiguration, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(AcquirerProtocolParameters1.mmApplicationIdentification, ApplicationParameters1.mmApplicationIdentification, AcquirerProtocolParameters3.mmApplicationIdentification,
					ApplicationParameters2.mmApplicationIdentification, AcquirerProtocolParameters6.mmApplicationIdentification, ApplicationParameters3.mmApplicationIdentification, AcquirerProtocolParameters7.mmApplicationIdentification,
					ApplicationParameters4.mmApplicationIdentification, ApplicationParameters5.mmApplicationIdentification, AcquirerProtocolParameters9.mmApplicationIdentification, ApplicationParameters6.mmApplicationIdentification,
					AcquirerProtocolParameters10.mmApplicationIdentification, ApplicationParameters7.mmApplicationIdentification, AcquirerProtocolParameters11.mmApplicationIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AcceptorConfiguration obj) {
			return obj.getApplicationIdentification();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Max35Text value) {
			obj.setApplicationIdentification(value);
		}
	};
	protected FinancialCaptureCode financialCapture;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mode for the financial capture of the transaction by the acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, FinancialCaptureCode> mmFinancialCapture = new MMBusinessAttribute<AcceptorConfiguration, FinancialCaptureCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AcquirerProtocolParameters2.mmFinancialCapture, AcquirerProtocolParameters4.mmFinancialCapture, AcquirerProtocolParameters5.mmFinancialCapture,
					AcquirerProtocolParameters8.mmFinancialCapture);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialCapture";
			definition = "Mode for the financial capture of the transaction by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCaptureCode.mmObject();
		}

		@Override
		public FinancialCaptureCode getValue(AcceptorConfiguration obj) {
			return obj.getFinancialCapture();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, FinancialCaptureCode value) {
			obj.setFinancialCapture(value);
		}
	};
	protected BatchTransactionTypeCode batchTransferContent;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmBatchTransferContent
	 * AcquirerProtocolParameters11.mmBatchTransferContent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransferContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Types of transaction to include in the batch."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, BatchTransactionTypeCode> mmBatchTransferContent = new MMBusinessAttribute<AcceptorConfiguration, BatchTransactionTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AcquirerProtocolParameters2.mmBatchTransfer, AcquirerProtocolParameters1.mmBatchTransferContent, AcquirerProtocolParameters4.mmBatchTransfer,
					AcquirerProtocolParameters3.mmBatchTransferContent, AcquirerProtocolParameters6.mmBatchTransferContent, AcquirerProtocolParameters5.mmBatchTransfer, AcquirerProtocolParameters7.mmBatchTransferContent,
					AcquirerProtocolParameters8.mmBatchTransfer, AcquirerProtocolParameters9.mmBatchTransferContent, AcquirerProtocolParameters10.mmBatchTransferContent, AcquirerProtocolParameters11.mmBatchTransferContent);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BatchTransactionTypeCode.mmObject();
		}

		@Override
		public BatchTransactionTypeCode getValue(AcceptorConfiguration obj) {
			return obj.getBatchTransferContent();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, BatchTransactionTypeCode value) {
			obj.setBatchTransferContent(value);
		}
	};
	protected ExchangePolicyCode exchangePolicy;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangePolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange policy between parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, ExchangePolicyCode> mmExchangePolicy = new MMBusinessAttribute<AcceptorConfiguration, ExchangePolicyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ExchangeConfiguration1.mmExchangePolicy, ExchangeConfiguration2.mmExchangePolicy, ExchangeConfiguration3.mmExchangePolicy, ExchangeConfiguration5.mmExchangePolicy,
					ExchangeConfiguration4.mmExchangePolicy, ExchangeConfiguration6.mmExchangePolicy, ExchangeConfiguration7.mmExchangePolicy);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangePolicy";
			definition = "Exchange policy between parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangePolicyCode.mmObject();
		}

		@Override
		public ExchangePolicyCode getValue(AcceptorConfiguration obj) {
			return obj.getExchangePolicy();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, ExchangePolicyCode value) {
			obj.setExchangePolicy(value);
		}
	};
	protected Number maximumNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of transactions without exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, Number> mmMaximumNumber = new MMBusinessAttribute<AcceptorConfiguration, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(ExchangeConfiguration1.mmMaximumNumber, ExchangeConfiguration2.mmMaximumNumber, ExchangeConfiguration3.mmMaximumNumber, ExchangeConfiguration5.mmMaximumNumber,
					ExchangeConfiguration4.mmMaximumNumber, ExchangeConfiguration6.mmMaximumNumber, ExchangeConfiguration7.mmMaximumNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of transactions without exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(AcceptorConfiguration obj) {
			return obj.getMaximumNumber();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Number value) {
			obj.setMaximumNumber(value);
		}
	};
	protected ImpliedCurrencyAndAmount maximumAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum cumulative amount of the transactions without exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, ImpliedCurrencyAndAmount> mmMaximumAmount = new MMBusinessAttribute<AcceptorConfiguration, ImpliedCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(ExchangeConfiguration1.mmMaximumAmount, ExchangeConfiguration2.mmMaximumAmount, ExchangeConfiguration3.mmMaximumAmount, ExchangeConfiguration5.mmMaximumAmount,
					ExchangeConfiguration4.mmMaximumAmount, ExchangeConfiguration6.mmMaximumAmount, ExchangeConfiguration7.mmMaximumAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum cumulative amount of the transactions without exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(AcceptorConfiguration obj) {
			return obj.getMaximumAmount();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, ImpliedCurrencyAndAmount value) {
			obj.setMaximumAmount(value);
		}
	};
	protected TrueFalseIndicator reconciliationByAcquirer;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters11.mmReconciliationByAcquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationByAcquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator> mmReconciliationByAcquirer = new MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(AcquirerProtocolParameters1.mmReconciliationByAcquirer, AcquirerProtocolParameters3.mmReconciliationByAcquirer, AcquirerProtocolParameters6.mmReconciliationByAcquirer,
					AcquirerProtocolParameters7.mmReconciliationByAcquirer, AcquirerProtocolParameters9.mmReconciliationByAcquirer, AcquirerProtocolParameters10.mmReconciliationByAcquirer,
					AcquirerProtocolParameters11.mmReconciliationByAcquirer);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(AcceptorConfiguration obj) {
			return obj.getReconciliationByAcquirer();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, TrueFalseIndicator value) {
			obj.setReconciliationByAcquirer(value);
		}
	};
	protected TrueFalseIndicator totalsPerCurrency;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmTotalsPerCurrency
	 * AcquirerProtocolParameters11.mmTotalsPerCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsPerCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation total amounts are computed per currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator> mmTotalsPerCurrency = new MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(AcquirerProtocolParameters1.mmTotalsPerCurrency, AcquirerProtocolParameters3.mmTotalsPerCurrency, AcquirerProtocolParameters6.mmTotalsPerCurrency,
					AcquirerProtocolParameters7.mmTotalsPerCurrency, AcquirerProtocolParameters9.mmTotalsPerCurrency, AcquirerProtocolParameters10.mmTotalsPerCurrency, AcquirerProtocolParameters11.mmTotalsPerCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(AcceptorConfiguration obj) {
			return obj.getTotalsPerCurrency();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, TrueFalseIndicator value) {
			obj.setTotalsPerCurrency(value);
		}
	};
	protected TrueFalseIndicator protectCardData;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmProtectCardData
	 * AcquirerProtocolParameters11.mmProtectCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator to require protection of sensitive card data in messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator> mmProtectCardData = new MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(AcquirerProtocolParameters1.mmProtectCardData, AcquirerProtocolParameters3.mmProtectCardData, AcquirerProtocolParameters6.mmProtectCardData, AcquirerProtocolParameters7.mmProtectCardData,
					AcquirerProtocolParameters9.mmProtectCardData, AcquirerProtocolParameters10.mmProtectCardData, AcquirerProtocolParameters11.mmProtectCardData);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(AcceptorConfiguration obj) {
			return obj.getProtectCardData();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, TrueFalseIndicator value) {
			obj.setProtectCardData(value);
		}
	};
	protected Max10000Binary retailerParameters;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailerParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor parameters dedicated to the retailer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, Max10000Binary> mmRetailerParameters = new MMBusinessAttribute<AcceptorConfiguration, Max10000Binary>() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptorConfigurationContent1.mmMerchantParameters, AcceptorConfigurationContent2.mmMerchantParameters, AcceptorConfigurationContent3.mmMerchantParameters);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RetailerParameters";
			definition = "Acceptor parameters dedicated to the retailer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Max10000Binary getValue(AcceptorConfiguration obj) {
			return obj.getRetailerParameters();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Max10000Binary value) {
			obj.setRetailerParameters(value);
		}
	};
	protected Max10000Binary applicationParameters;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmApplicationParameters
	 * AcceptorConfigurationContent7.mmApplicationParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters attached to the payment application."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, Max10000Binary> mmApplicationParameters = new MMBusinessAttribute<AcceptorConfiguration, Max10000Binary>() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptorConfigurationContent1.mmApplicationParameters, AcceptorConfigurationContent2.mmApplicationParameters, AcceptorConfigurationContent3.mmApplicationParameters,
					AcceptorConfigurationContent4.mmApplicationParameters, AcceptorConfigurationContent5.mmApplicationParameters, AcceptorConfigurationContent6.mmApplicationParameters, AcceptorConfigurationContent7.mmApplicationParameters);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Configuration parameters attached to the payment application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Max10000Binary getValue(AcceptorConfiguration obj) {
			return obj.getApplicationParameters();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Max10000Binary value) {
			obj.setApplicationParameters(value);
		}
	};
	protected TerminalManagementSystem terminalManagementSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmAcceptorConfiguration
	 * TerminalManagementSystem.mmAcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent7#mmHostCommunicationParameters
	 * AcceptorConfigurationContent7.mmHostCommunicationParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmHost
	 * AcquirerProtocolParameters11.mmHost}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system for which an acceptor configuration is provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<AcceptorConfiguration, Optional<TerminalManagementSystem>> mmTerminalManagementSystem = new MMBusinessAssociationEnd<AcceptorConfiguration, Optional<TerminalManagementSystem>>() {
		{
			derivation_lazy = () -> Arrays.asList(AcquirerProtocolParameters1.mmHost, AcceptorConfigurationContent1.mmHostCommunicationParameters, AcquirerProtocolParameters3.mmHost,
					AcceptorConfigurationContent2.mmHostCommunicationParameters, AcceptorConfigurationContent3.mmHostCommunicationParameters, AcquirerProtocolParameters6.mmHost, AcquirerProtocolParameters7.mmHost,
					AcceptorConfigurationContent4.mmHostCommunicationParameters, AcquirerProtocolParameters9.mmHost, AcceptorConfigurationContent5.mmHostCommunicationParameters, AcceptorConfigurationContent6.mmHostCommunicationParameters,
					AcquirerProtocolParameters10.mmHost, AcceptorConfigurationContent7.mmHostCommunicationParameters, AcquirerProtocolParameters11.mmHost);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system for which an acceptor configuration is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> TerminalManagementSystem.mmAcceptorConfiguration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TerminalManagementSystem.mmObject();
		}

		@Override
		public Optional<TerminalManagementSystem> getValue(AcceptorConfiguration obj) {
			return obj.getTerminalManagementSystem();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Optional<TerminalManagementSystem> value) {
			obj.setTerminalManagementSystem(value.orElse(null));
		}
	};
	protected Max35Text applicationVersion;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the application."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<AcceptorConfiguration, Max35Text> mmApplicationVersion = new MMBusinessAttribute<AcceptorConfiguration, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicationVersion";
			definition = "Version of the application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AcceptorConfiguration obj) {
			return obj.getApplicationVersion();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Max35Text value) {
			obj.setApplicationVersion(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfiguration";
				definition = "Acceptor parameters to be downloaded from the terminal management system.";
				associationDomain_lazy = () -> Arrays.asList(TerminalManagementSystem.mmAcceptorConfiguration);
				derivationElement_lazy = () -> Arrays.asList(AcquirerProtocolParameters2.mmCompletionExchange, AcquirerProtocolParameters1.mmOnLineTransaction, AcquirerProtocolParameters1.mmOffLineTransaction,
						AcquirerProtocolParameters1.mmReconciliationExchange, AcceptorConfigurationContent1.mmAcquirerProtocolParameters, AcceptorConfiguration1.mmDataSet, AcquirerProtocolParameters4.mmCompletionExchange,
						AcquirerProtocolParameters3.mmOnLineTransaction, AcquirerProtocolParameters3.mmOffLineTransaction, AcquirerProtocolParameters3.mmReconciliationExchange, AcceptorConfigurationContent2.mmAcquirerProtocolParameters,
						AcceptorConfiguration2.mmDataSet, AcceptorConfigurationContent3.mmAcquirerProtocolParameters, AcquirerProtocolParameters6.mmOnLineTransaction, AcquirerProtocolParameters7.mmOnLineTransaction,
						AcceptorConfigurationContent4.mmAcquirerProtocolParameters, AcquirerProtocolParameters9.mmOnLineTransaction, AcceptorConfigurationContent5.mmAcquirerProtocolParameters,
						AcceptorConfigurationContent6.mmAcquirerProtocolParameters, AcquirerProtocolParameters10.mmOnLineTransaction, AcceptorConfigurationContent7.mmAcquirerProtocolParameters,
						AcquirerProtocolParameters11.mmOnLineTransaction);
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
						TerminalManagementDataSet20.mmObject(), ApplicationParameters6.mmObject(), AcceptorConfigurationContent6.mmObject(), AcquirerProtocolParameters10.mmObject(), AcceptorConfiguration7.mmObject(),
						ApplicationParameters7.mmObject(), TerminalManagementDataSet23.mmObject(), AcceptorConfigurationContent7.mmObject(), AcquirerProtocolParameters11.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorConfiguration.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getApplicationIdentification() {
		return applicationIdentification;
	}

	public AcceptorConfiguration setApplicationIdentification(Max35Text applicationIdentification) {
		this.applicationIdentification = Objects.requireNonNull(applicationIdentification);
		return this;
	}

	public FinancialCaptureCode getFinancialCapture() {
		return financialCapture;
	}

	public AcceptorConfiguration setFinancialCapture(FinancialCaptureCode financialCapture) {
		this.financialCapture = Objects.requireNonNull(financialCapture);
		return this;
	}

	public BatchTransactionTypeCode getBatchTransferContent() {
		return batchTransferContent;
	}

	public AcceptorConfiguration setBatchTransferContent(BatchTransactionTypeCode batchTransferContent) {
		this.batchTransferContent = Objects.requireNonNull(batchTransferContent);
		return this;
	}

	public ExchangePolicyCode getExchangePolicy() {
		return exchangePolicy;
	}

	public AcceptorConfiguration setExchangePolicy(ExchangePolicyCode exchangePolicy) {
		this.exchangePolicy = Objects.requireNonNull(exchangePolicy);
		return this;
	}

	public Number getMaximumNumber() {
		return maximumNumber;
	}

	public AcceptorConfiguration setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = Objects.requireNonNull(maximumNumber);
		return this;
	}

	public ImpliedCurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public AcceptorConfiguration setMaximumAmount(ImpliedCurrencyAndAmount maximumAmount) {
		this.maximumAmount = Objects.requireNonNull(maximumAmount);
		return this;
	}

	public TrueFalseIndicator getReconciliationByAcquirer() {
		return reconciliationByAcquirer;
	}

	public AcceptorConfiguration setReconciliationByAcquirer(TrueFalseIndicator reconciliationByAcquirer) {
		this.reconciliationByAcquirer = Objects.requireNonNull(reconciliationByAcquirer);
		return this;
	}

	public TrueFalseIndicator getTotalsPerCurrency() {
		return totalsPerCurrency;
	}

	public AcceptorConfiguration setTotalsPerCurrency(TrueFalseIndicator totalsPerCurrency) {
		this.totalsPerCurrency = Objects.requireNonNull(totalsPerCurrency);
		return this;
	}

	public TrueFalseIndicator getProtectCardData() {
		return protectCardData;
	}

	public AcceptorConfiguration setProtectCardData(TrueFalseIndicator protectCardData) {
		this.protectCardData = Objects.requireNonNull(protectCardData);
		return this;
	}

	public Max10000Binary getRetailerParameters() {
		return retailerParameters;
	}

	public AcceptorConfiguration setRetailerParameters(Max10000Binary retailerParameters) {
		this.retailerParameters = Objects.requireNonNull(retailerParameters);
		return this;
	}

	public Max10000Binary getApplicationParameters() {
		return applicationParameters;
	}

	public AcceptorConfiguration setApplicationParameters(Max10000Binary applicationParameters) {
		this.applicationParameters = Objects.requireNonNull(applicationParameters);
		return this;
	}

	public Optional<TerminalManagementSystem> getTerminalManagementSystem() {
		return terminalManagementSystem == null ? Optional.empty() : Optional.of(terminalManagementSystem);
	}

	public AcceptorConfiguration setTerminalManagementSystem(TerminalManagementSystem terminalManagementSystem) {
		this.terminalManagementSystem = terminalManagementSystem;
		return this;
	}

	public Max35Text getApplicationVersion() {
		return applicationVersion;
	}

	public AcceptorConfiguration setApplicationVersion(Max35Text applicationVersion) {
		this.applicationVersion = Objects.requireNonNull(applicationVersion);
		return this;
	}
}