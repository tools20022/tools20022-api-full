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
import com.tools20022.repository.codeset.FinancialCapture1Code;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Acceptor parameters dedicated to the acquirer protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2#mmFinancialCapture
 * AcquirerProtocolParameters2.mmFinancialCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2#mmBatchTransfer
 * AcquirerProtocolParameters2.mmBatchTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2#mmCompletionExchange
 * AcquirerProtocolParameters2.mmCompletionExchange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
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
 * "AcquirerProtocolParameters2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acceptor parameters dedicated to the acquirer protocol."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4
 * AcquirerProtocolParameters4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcquirerProtocolParameters2", propOrder = {"financialCapture", "batchTransfer", "completionExchange"})
public class AcquirerProtocolParameters2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialCapture1Code financialCapture;
	/**
	 * Mode for the financial capture of the transaction by the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCapture1Code
	 * FinancialCapture1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmFinancialCapture
	 * AcceptorConfiguration.mmFinancialCapture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2
	 * AcquirerProtocolParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinCaptr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mode for the financial capture of the transaction by the acquirer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialCapture = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmFinancialCapture;
			componentContext_lazy = () -> AcquirerProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "FinCaptr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCapture";
			definition = "Mode for the financial capture of the transaction by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCapture1Code.mmObject();
		}
	};
	protected ExchangeConfiguration1 batchTransfer;
	/**
	 * Configuration of the batch transfers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration1
	 * ExchangeConfiguration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmBatchTransferContent
	 * AcceptorConfiguration.mmBatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2
	 * AcquirerProtocolParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of the batch transfers."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBatchTransfer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmBatchTransferContent;
			componentContext_lazy = () -> AcquirerProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "BtchTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransfer";
			definition = "Configuration of the batch transfers.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration1.mmObject();
		}
	};
	protected ExchangeConfiguration1 completionExchange;
	/**
	 * Configuration parameters of completion exchanges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration1
	 * ExchangeConfiguration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters2
	 * AcquirerProtocolParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltnXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters of completion exchanges."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCompletionExchange = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> AcquirerProtocolParameters2.mmObject();
			isDerived = false;
			xmlTag = "CmpltnXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionExchange";
			definition = "Configuration parameters of completion exchanges.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AcquirerProtocolParameters2.mmFinancialCapture, AcquirerProtocolParameters2.mmBatchTransfer, AcquirerProtocolParameters2.mmCompletionExchange);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerProtocolParameters2";
				definition = "Acceptor parameters dedicated to the acquirer protocol.";
				nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FinCaptr", required = true)
	public FinancialCapture1Code getFinancialCapture() {
		return financialCapture;
	}

	public void setFinancialCapture(FinancialCapture1Code financialCapture) {
		this.financialCapture = financialCapture;
	}

	@XmlElement(name = "BtchTrf")
	public ExchangeConfiguration1 getBatchTransfer() {
		return batchTransfer;
	}

	public void setBatchTransfer(com.tools20022.repository.msg.ExchangeConfiguration1 batchTransfer) {
		this.batchTransfer = batchTransfer;
	}

	@XmlElement(name = "CmpltnXchg")
	public ExchangeConfiguration1 getCompletionExchange() {
		return completionExchange;
	}

	public void setCompletionExchange(com.tools20022.repository.msg.ExchangeConfiguration1 completionExchange) {
		this.completionExchange = completionExchange;
	}
}