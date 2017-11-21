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
import com.tools20022.repository.area.acmt.AccountModificationInstructionV06;
import com.tools20022.repository.codeset.DataModification1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Scope of the modification to be applied on an identified set of information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ModificationScope30#mmModificationScopeIndication
 * ModificationScope30.mmModificationScopeIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ModificationScope30#mmAdditionalInformation
 * ModificationScope30.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmModifiedAdditionalInformation
 * AccountModificationInstructionV06.mmModifiedAdditionalInformation}</li>
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
 * "ModificationScope30"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope of the modification to be applied on an identified set of information."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ModificationScope35
 * ModificationScope35}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ModificationScope26
 * ModificationScope26}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ModificationScope30", propOrder = {"modificationScopeIndication", "additionalInformation"})
public class ModificationScope30 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DataModification1Code modificationScopeIndication;
	/**
	 * Specifies the type of modification to be applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataModification1Code
	 * DataModification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope30
	 * ModificationScope30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModScpIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationScopeIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of modification to be applied."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationScope35#mmModificationScopeIndication
	 * ModificationScope35.mmModificationScopeIndication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope26#mmModificationScopeIndication
	 * ModificationScope26.mmModificationScopeIndication}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModificationScopeIndication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ModificationScope30.mmObject();
			isDerived = false;
			xmlTag = "ModScpIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationScopeIndication";
			definition = "Specifies the type of modification to be applied.";
			nextVersions_lazy = () -> Arrays.asList(ModificationScope35.mmModificationScopeIndication);
			previousVersion_lazy = () -> ModificationScope26.mmModificationScopeIndication;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataModification1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AccountRestrictions1> additionalInformation;
	/**
	 * Additional information concerning limitations and restrictions on the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ModificationScope30
	 * ModificationScope30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information concerning limitations and restrictions on the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ModificationScope35#mmAdditionalInformation
	 * ModificationScope35.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ModificationScope30.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information concerning limitations and restrictions on the account.";
			nextVersions_lazy = () -> Arrays.asList(ModificationScope35.mmAdditionalInformation);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountRestrictions1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ModificationScope30.mmModificationScopeIndication, ModificationScope30.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountModificationInstructionV06.mmModifiedAdditionalInformation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ModificationScope30";
				definition = "Scope of the modification to be applied on an identified set of information.";
				nextVersions_lazy = () -> Arrays.asList(ModificationScope35.mmObject());
				previousVersion_lazy = () -> ModificationScope26.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ModScpIndctn", required = true)
	public DataModification1Code getModificationScopeIndication() {
		return modificationScopeIndication;
	}

	public void setModificationScopeIndication(DataModification1Code modificationScopeIndication) {
		this.modificationScopeIndication = modificationScopeIndication;
	}

	@XmlElement(name = "AddtlInf", required = true)
	public List<AccountRestrictions1> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<com.tools20022.repository.msg.AccountRestrictions1> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}