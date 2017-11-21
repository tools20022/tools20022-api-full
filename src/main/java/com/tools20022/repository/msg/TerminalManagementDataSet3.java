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
import com.tools20022.repository.datatype.Max9NumericText;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data set containing the acceptor parameters of a point of interaction (POI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet3#mmIdentification
 * TerminalManagementDataSet3.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet3#mmSequenceCounter
 * TerminalManagementDataSet3.mmSequenceCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet3#mmContent
 * TerminalManagementDataSet3.mmContent}</li>
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
 * "TerminalManagementDataSet3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Data set containing the acceptor parameters of a point of interaction (POI)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet6
 * TerminalManagementDataSet6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TerminalManagementDataSet3", propOrder = {"identification", "sequenceCounter", "content"})
public class TerminalManagementDataSet3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DataSetIdentification2 identification;
	/**
	 * Identification of the data set transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification2
	 * DataSetIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet3
	 * TerminalManagementDataSet3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the data set transferred."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet3.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the data set transferred.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DataSetIdentification2.mmObject();
		}
	};
	protected Max9NumericText sequenceCounter;
	/**
	 * Counter to identify a single data set within the whole transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet3
	 * TerminalManagementDataSet3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqCntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counter to identify a single data set within the whole transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSequenceCounter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet3.mmObject();
			isDerived = false;
			xmlTag = "SeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceCounter";
			definition = "Counter to identify a single data set within the whole transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}
	};
	protected AcceptorConfigurationContent1 content;
	/**
	 * Content of the acceptor parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfigurationContent1
	 * AcceptorConfigurationContent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet3
	 * TerminalManagementDataSet3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cntt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Content"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Content of the acceptor parameters."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet3.mmObject();
			isDerived = false;
			xmlTag = "Cntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Content";
			definition = "Content of the acceptor parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcceptorConfigurationContent1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TerminalManagementDataSet3.mmIdentification, TerminalManagementDataSet3.mmSequenceCounter, TerminalManagementDataSet3.mmContent);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementDataSet3";
				definition = "Data set containing the acceptor parameters of a point of interaction (POI).";
				nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public DataSetIdentification2 getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.msg.DataSetIdentification2 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "SeqCntr")
	public Max9NumericText getSequenceCounter() {
		return sequenceCounter;
	}

	public void setSequenceCounter(Max9NumericText sequenceCounter) {
		this.sequenceCounter = sequenceCounter;
	}

	@XmlElement(name = "Cntt", required = true)
	public AcceptorConfigurationContent1 getContent() {
		return content;
	}

	public void setContent(com.tools20022.repository.msg.AcceptorConfigurationContent1 content) {
		this.content = content;
	}
}