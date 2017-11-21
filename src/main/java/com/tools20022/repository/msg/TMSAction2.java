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
import com.tools20022.repository.codeset.TerminalManagementAction1Code;
import com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code;
import com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Single terminal management action to be performed by the point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#mmType
 * TMSAction2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#mmAddress
 * TMSAction2.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction2#mmDataSetIdentification
 * TMSAction2.mmDataSetIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#mmTrigger
 * TMSAction2.mmTrigger}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#mmAdditionalProcess
 * TMSAction2.mmAdditionalProcess}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#mmTimeCondition
 * TMSAction2.mmTimeCondition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#mmTMChallenge
 * TMSAction2.mmTMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TMSAction2#mmKeyEnciphermentCertificate
 * TMSAction2.mmKeyEnciphermentCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction2#mmErrorAction
 * TMSAction2.mmErrorAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
 * TerminalManagementAction}</li>
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
 * "TMSAction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Single terminal management action to be performed by the point of interaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3 TMSAction3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TMSAction1
 * TMSAction1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TMSAction2", propOrder = {"type", "address", "dataSetIdentification", "trigger", "additionalProcess", "timeCondition", "TMChallenge", "keyEnciphermentCertificate", "errorAction"})
public class TMSAction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TerminalManagementAction1Code type;
	/**
	 * Types of action to be performed by a point of interaction (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
	 * TerminalManagementAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmType
	 * TerminalManagementAction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction2
	 * TMSAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Types of action to be performed by a point of interaction (POI)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#mmType
	 * TMSAction3.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmType;
			componentContext_lazy = () -> TMSAction2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Types of action to be performed by a point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(TMSAction3.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction1Code.mmObject();
		}
	};
	protected NetworkParameters1 address;
	/**
	 * Communication parameters of the terminal management system to contact.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetworkParameters1
	 * NetworkParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmNetworkAccess
	 * TerminalManagementSystem.mmNetworkAccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction2
	 * TMSAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Address"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Communication parameters of the terminal management system to contact."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#mmAddress
	 * TMSAction3.mmAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAddress = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TerminalManagementSystem.mmNetworkAccess;
			componentContext_lazy = () -> TMSAction2.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Communication parameters of the terminal management system to contact.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction3.mmAddress);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetworkParameters1.mmObject();
		}
	};
	protected DataSetIdentification3 dataSetIdentification;
	/**
	 * Data set on which the action has to be performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataSetIdentification3
	 * DataSetIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction2
	 * TMSAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data set on which the action has to be performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmDataSetIdentification
	 * TMSAction3.mmDataSetIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDataSetIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TMSAction2.mmObject();
			isDerived = false;
			xmlTag = "DataSetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetIdentification";
			definition = "Data set on which the action has to be performed.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction3.mmDataSetIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DataSetIdentification3.mmObject();
		}
	};
	protected TerminalManagementActionTrigger1Code trigger;
	/**
	 * Event on which the action has to be activated by the point of interaction
	 * (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionTrigger1Code
	 * TerminalManagementActionTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmTrigger
	 * TerminalManagementAction.mmTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction2
	 * TMSAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trggr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event on which the action has to be activated by the point of interaction (POI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#mmTrigger
	 * TMSAction3.mmTrigger}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTrigger = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmTrigger;
			componentContext_lazy = () -> TMSAction2.mmObject();
			isDerived = false;
			xmlTag = "Trggr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trigger";
			definition = "Event on which the action has to be activated by the point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(TMSAction3.mmTrigger);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionTrigger1Code.mmObject();
		}
	};
	protected TerminalManagementAdditionalProcess1Code additionalProcess;
	/**
	 * Additional process to perform before starting or after completing the
	 * action by the point of interaction (POI).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code
	 * TerminalManagementAdditionalProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmAdditionalProcess
	 * TerminalManagementAction.mmAdditionalProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction2
	 * TMSAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional process to perform before starting or after completing the action by the point of interaction (POI)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmAdditionalProcess
	 * TMSAction3.mmAdditionalProcess}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalProcess = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmAdditionalProcess;
			componentContext_lazy = () -> TMSAction2.mmObject();
			isDerived = false;
			xmlTag = "AddtlPrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalProcess";
			definition = "Additional process to perform before starting or after completing the action by the point of interaction (POI).";
			nextVersions_lazy = () -> Arrays.asList(TMSAction3.mmAdditionalProcess);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TerminalManagementAdditionalProcess1Code.mmObject();
		}
	};
	protected ProcessTiming2 timeCondition;
	/**
	 * Date and time the action has to be performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProcessTiming2
	 * ProcessTiming2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction2
	 * TMSAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmCond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time the action has to be performed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#mmTimeCondition
	 * TMSAction3.mmTimeCondition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTimeCondition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TMSAction2.mmObject();
			isDerived = false;
			xmlTag = "TmCond";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeCondition";
			definition = "Date and time the action has to be performed.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction3.mmTimeCondition);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProcessTiming2.mmObject();
		}
	};
	protected Max140Binary tMChallenge;
	/**
	 * Terminal manager challenge for cryptographic key injection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction2
	 * TMSAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMChllng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal manager challenge for cryptographic key injection."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#mmTMChallenge
	 * TMSAction3.mmTMChallenge}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTMChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSAction2.mmObject();
			isDerived = false;
			xmlTag = "TMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMChallenge";
			definition = "Terminal manager challenge for cryptographic key injection.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction3.mmTMChallenge);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	protected List<Max5000Binary> keyEnciphermentCertificate;
	/**
	 * Certificate chain for the encryption of temporary transport key of the
	 * key to inject.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction2
	 * TMSAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyNcphrmntCert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyEnciphermentCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate chain for the encryption of temporary transport key of the key to inject."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TMSAction3#mmKeyEnciphermentCertificate
	 * TMSAction3.mmKeyEnciphermentCertificate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmKeyEnciphermentCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TMSAction2.mmObject();
			isDerived = false;
			xmlTag = "KeyNcphrmntCert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyEnciphermentCertificate";
			definition = "Certificate chain for the encryption of temporary transport key of the key to inject.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction3.mmKeyEnciphermentCertificate);
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ErrorAction2> errorAction;
	/**
	 * Action to perform in case of error on the related action in progress.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorAction2
	 * ErrorAction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
	 * TerminalManagementAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TMSAction2
	 * TMSAction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ErrActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Action to perform in case of error on the related action in progress."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TMSAction3#mmErrorAction
	 * TMSAction3.mmErrorAction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmErrorAction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TerminalManagementAction.mmObject();
			componentContext_lazy = () -> TMSAction2.mmObject();
			isDerived = false;
			xmlTag = "ErrActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorAction";
			definition = "Action to perform in case of error on the related action in progress.";
			nextVersions_lazy = () -> Arrays.asList(TMSAction3.mmErrorAction);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ErrorAction2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TMSAction2.mmType, TMSAction2.mmAddress, TMSAction2.mmDataSetIdentification, TMSAction2.mmTrigger, TMSAction2.mmAdditionalProcess, TMSAction2.mmTimeCondition,
						TMSAction2.mmTMChallenge, TMSAction2.mmKeyEnciphermentCertificate, TMSAction2.mmErrorAction);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TMSAction2";
				definition = "Single terminal management action to be performed by the point of interaction.";
				nextVersions_lazy = () -> Arrays.asList(TMSAction3.mmObject());
				previousVersion_lazy = () -> TMSAction1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp", required = true)
	public TerminalManagementAction1Code getType() {
		return type;
	}

	public void setType(TerminalManagementAction1Code type) {
		this.type = type;
	}

	@XmlElement(name = "Adr")
	public NetworkParameters1 getAddress() {
		return address;
	}

	public void setAddress(com.tools20022.repository.msg.NetworkParameters1 address) {
		this.address = address;
	}

	@XmlElement(name = "DataSetId")
	public DataSetIdentification3 getDataSetIdentification() {
		return dataSetIdentification;
	}

	public void setDataSetIdentification(com.tools20022.repository.msg.DataSetIdentification3 dataSetIdentification) {
		this.dataSetIdentification = dataSetIdentification;
	}

	@XmlElement(name = "Trggr", required = true)
	public TerminalManagementActionTrigger1Code getTrigger() {
		return trigger;
	}

	public void setTrigger(TerminalManagementActionTrigger1Code trigger) {
		this.trigger = trigger;
	}

	@XmlElement(name = "AddtlPrc")
	public TerminalManagementAdditionalProcess1Code getAdditionalProcess() {
		return additionalProcess;
	}

	public void setAdditionalProcess(TerminalManagementAdditionalProcess1Code additionalProcess) {
		this.additionalProcess = additionalProcess;
	}

	@XmlElement(name = "TmCond")
	public ProcessTiming2 getTimeCondition() {
		return timeCondition;
	}

	public void setTimeCondition(com.tools20022.repository.msg.ProcessTiming2 timeCondition) {
		this.timeCondition = timeCondition;
	}

	@XmlElement(name = "TMChllng")
	public Max140Binary getTMChallenge() {
		return tMChallenge;
	}

	public void setTMChallenge(Max140Binary tMChallenge) {
		this.tMChallenge = tMChallenge;
	}

	@XmlElement(name = "KeyNcphrmntCert")
	public List<Max5000Binary> getKeyEnciphermentCertificate() {
		return keyEnciphermentCertificate;
	}

	public void setKeyEnciphermentCertificate(List<Max5000Binary> keyEnciphermentCertificate) {
		this.keyEnciphermentCertificate = keyEnciphermentCertificate;
	}

	@XmlElement(name = "ErrActn")
	public List<ErrorAction2> getErrorAction() {
		return errorAction;
	}

	public void setErrorAction(List<com.tools20022.repository.msg.ErrorAction2> errorAction) {
		this.errorAction = errorAction;
	}
}