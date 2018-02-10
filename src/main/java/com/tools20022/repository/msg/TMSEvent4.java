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
import com.tools20022.repository.codeset.TerminalManagementActionResult1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Result of an individual terminal management action performed by the point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent4#mmTimeStamp
 * TMSEvent4.mmTimeStamp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent4#mmResult
 * TMSEvent4.mmResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSEvent4#mmActionIdentification
 * TMSEvent4.mmActionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSEvent4#mmAdditionalErrorInformation
 * TMSEvent4.mmAdditionalErrorInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
 * TerminalManagementAction}</li>
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
 * "TMSEvent4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Result of an individual terminal management action performed by the point of interaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent5 TMSEvent5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TMSEvent3
 * TMSEvent3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TMSEvent4", propOrder = {"timeStamp", "result", "actionIdentification", "additionalErrorInformation"})
public class TMSEvent4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TmStmp", required = true)
	protected ISODateTime timeStamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSEvent4
	 * TMSEvent4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date time of the terminal management action performed by the point of interaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent5#mmTimeStamp
	 * TMSEvent5.mmTimeStamp}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSEvent3#mmTimeStamp
	 * TMSEvent3.mmTimeStamp}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSEvent4.mmObject();
			isDerived = false;
			xmlTag = "TmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeStamp";
			definition = "Date time of the terminal management action performed by the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(TMSEvent5.mmTimeStamp);
			previousVersion_lazy = () -> TMSEvent3.mmTimeStamp;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "Rslt", required = true)
	protected TerminalManagementActionResult1Code result;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmActionResult
	 * TerminalManagementAction.mmActionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSEvent4
	 * TMSEvent4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Final result of the processed terminal management action."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSEvent5#mmResult
	 * TMSEvent5.mmResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSEvent3#mmResult
	 * TMSEvent3.mmResult}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResult = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmActionResult;
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSEvent4.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Final result of the processed terminal management action.";
			nextVersions_lazy = () -> Arrays.asList(TMSEvent5.mmResult);
			previousVersion_lazy = () -> TMSEvent3.mmResult;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionResult1Code.mmObject();
		}
	};
	@XmlElement(name = "ActnId", required = true)
	protected TMSActionIdentification4 actionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TMSActionIdentification4
	 * TMSActionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSEvent4
	 * TMSEvent4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the terminal management action performed by the point of interaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSEvent5#mmActionIdentification
	 * TMSEvent5.mmActionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSEvent3#mmActionIdentification
	 * TMSEvent3.mmActionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmActionIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSEvent4.mmObject();
			isDerived = false;
			xmlTag = "ActnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionIdentification";
			definition = "Identification of the terminal management action performed by the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(TMSEvent5.mmActionIdentification);
			previousVersion_lazy = () -> TMSEvent3.mmActionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TMSActionIdentification4.mmObject();
		}
	};
	@XmlElement(name = "AddtlErrInf")
	protected Max70Text additionalErrorInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSEvent4
	 * TMSEvent4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlErrInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalErrorInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information related to a failure."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSEvent5#mmAdditionalErrorInformation
	 * TMSEvent5.mmAdditionalErrorInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TMSEvent3#mmAdditionalErrorInformation
	 * TMSEvent3.mmAdditionalErrorInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalErrorInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TMSEvent4.mmObject();
			isDerived = false;
			xmlTag = "AddtlErrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalErrorInformation";
			definition = "Additional information related to a failure.";
			nextVersions_lazy = () -> Arrays.asList(TMSEvent5.mmAdditionalErrorInformation);
			previousVersion_lazy = () -> TMSEvent3.mmAdditionalErrorInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TMSEvent4.mmTimeStamp, com.tools20022.repository.msg.TMSEvent4.mmResult, com.tools20022.repository.msg.TMSEvent4.mmActionIdentification,
						com.tools20022.repository.msg.TMSEvent4.mmAdditionalErrorInformation);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSEvent4";
				definition = "Result of an individual terminal management action performed by the point of interaction.";
				nextVersions_lazy = () -> Arrays.asList(TMSEvent5.mmObject());
				previousVersion_lazy = () -> TMSEvent3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getTimeStamp() {
		return timeStamp;
	}

	public TMSEvent4 setTimeStamp(ISODateTime timeStamp) {
		this.timeStamp = Objects.requireNonNull(timeStamp);
		return this;
	}

	public TerminalManagementActionResult1Code getResult() {
		return result;
	}

	public TMSEvent4 setResult(TerminalManagementActionResult1Code result) {
		this.result = Objects.requireNonNull(result);
		return this;
	}

	public TMSActionIdentification4 getActionIdentification() {
		return actionIdentification;
	}

	public TMSEvent4 setActionIdentification(com.tools20022.repository.msg.TMSActionIdentification4 actionIdentification) {
		this.actionIdentification = Objects.requireNonNull(actionIdentification);
		return this;
	}

	public Optional<Max70Text> getAdditionalErrorInformation() {
		return additionalErrorInformation == null ? Optional.empty() : Optional.of(additionalErrorInformation);
	}

	public TMSEvent4 setAdditionalErrorInformation(Max70Text additionalErrorInformation) {
		this.additionalErrorInformation = additionalErrorInformation;
		return this;
	}
}