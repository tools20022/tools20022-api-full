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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related to the status report of a point of interaction (POI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet9#mmIdentification
 * TerminalManagementDataSet9.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet9#mmSequenceCounter
 * TerminalManagementDataSet9.mmSequenceCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet9#mmContent
 * TerminalManagementDataSet9.mmContent}</li>
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
 * "TerminalManagementDataSet9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Data related to the status report of a point of interaction (POI)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TerminalManagementDataSet13
 * TerminalManagementDataSet13}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet4
 * TerminalManagementDataSet4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TerminalManagementDataSet9", propOrder = {"identification", "sequenceCounter", "content"})
public class TerminalManagementDataSet9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DataSetIdentification3 identification;
	/**
	 * Identification of the data set containing the status report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification3
	 * DataSetIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet9
	 * TerminalManagementDataSet9}</li>
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
	 * definition} =
	 * "Identification of the data set containing the status report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet13#mmIdentification
	 * TerminalManagementDataSet13.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet4#mmIdentification
	 * TerminalManagementDataSet4.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet9.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the data set containing the status report.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet13.mmIdentification);
			previousVersion_lazy = () -> TerminalManagementDataSet4.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DataSetIdentification3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet9
	 * TerminalManagementDataSet9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet13#mmSequenceCounter
	 * TerminalManagementDataSet13.mmSequenceCounter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet4#mmSequenceCounter
	 * TerminalManagementDataSet4.mmSequenceCounter}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSequenceCounter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet9.mmObject();
			isDerived = false;
			xmlTag = "SeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceCounter";
			definition = "Counter to identify a single data set within the whole transfer.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet13.mmSequenceCounter);
			previousVersion_lazy = () -> TerminalManagementDataSet4.mmSequenceCounter;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}
	};
	protected StatusReportContent3 content;
	/**
	 * Content of the status report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.StatusReportContent3
	 * StatusReportContent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet9
	 * TerminalManagementDataSet9}</li>
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
	 * definition} = "Content of the status report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet13#mmContent
	 * TerminalManagementDataSet13.mmContent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet4#mmContent
	 * TerminalManagementDataSet4.mmContent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TerminalManagementDataSet9.mmObject();
			isDerived = false;
			xmlTag = "Cntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Content";
			definition = "Content of the status report.";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet13.mmContent);
			previousVersion_lazy = () -> TerminalManagementDataSet4.mmContent;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatusReportContent3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TerminalManagementDataSet9.mmIdentification, TerminalManagementDataSet9.mmSequenceCounter, TerminalManagementDataSet9.mmContent);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementDataSet9";
				definition = "Data related to the status report of a point of interaction (POI).";
				nextVersions_lazy = () -> Arrays.asList(TerminalManagementDataSet13.mmObject());
				previousVersion_lazy = () -> TerminalManagementDataSet4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public DataSetIdentification3 getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.msg.DataSetIdentification3 identification) {
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
	public StatusReportContent3 getContent() {
		return content;
	}

	public void setContent(com.tools20022.repository.msg.StatusReportContent3 content) {
		this.content = content;
	}
}