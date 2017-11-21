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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.SystemMemberRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ClearingSystemMemberIdentification2;
import com.tools20022.repository.msg.GenericFinancialIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to identify a financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice#mmBICFI
 * MemberIdentification2Choice.mmBICFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice#mmClearingSystemMemberIdentification
 * MemberIdentification2Choice.mmClearingSystemMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice#mmOther
 * MemberIdentification2Choice.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
 * SystemMemberRole}</li>
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
 * "MemberIdentification2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of elements used to identify a financial institution."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MemberIdentification2Choice", propOrder = {"BICFI", "clearingSystemMemberIdentification", "other"})
public class MemberIdentification2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected BICFIIdentifier bICFI;
	/**
	 * Code allocated to a financial institution by the ISO 9362 Registration
	 * Authority as described in ISO 9362
	 * "Banking - Banking telecommunication messages - Business identifier code (BIC)"
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice
	 * MemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BICFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBICFI = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> MemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "BICFI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BICFI";
			definition = "Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	protected ClearingSystemMemberIdentification2 clearingSystemMemberIdentification;
	/**
	 * Information used to identify a member within a clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ClearingSystemMemberIdentification2
	 * ClearingSystemMemberIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmClearingSystemMemberIdentificationType
	 * OrganisationIdentification.mmClearingSystemMemberIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice
	 * MemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSysMmbId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information used to identify a member within a clearing system."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingSystemMemberIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmClearingSystemMemberIdentificationType;
			componentContext_lazy = () -> MemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "ClrSysMmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemMemberIdentification";
			definition = "Information used to identify a member within a clearing system.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ClearingSystemMemberIdentification2.mmObject();
		}
	};
	protected GenericFinancialIdentification1 other;
	/**
	 * Unique identification of an agent, as assigned by an institution, using
	 * an identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1
	 * GenericFinancialIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MemberIdentification2Choice
	 * MemberIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of an agent, as assigned by an institution, using an identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOther = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> MemberIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Unique identification of an agent, as assigned by an institution, using an identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericFinancialIdentification1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MemberIdentification2Choice.mmBICFI, MemberIdentification2Choice.mmClearingSystemMemberIdentification, MemberIdentification2Choice.mmOther);
				trace_lazy = () -> SystemMemberRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MemberIdentification2Choice";
				definition = "Set of elements used to identify a financial institution.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BICFI", required = true)
	public BICFIIdentifier getBICFI() {
		return bICFI;
	}

	public void setBICFI(BICFIIdentifier bICFI) {
		this.bICFI = bICFI;
	}

	@XmlElement(name = "ClrSysMmbId", required = true)
	public ClearingSystemMemberIdentification2 getClearingSystemMemberIdentification() {
		return clearingSystemMemberIdentification;
	}

	public void setClearingSystemMemberIdentification(ClearingSystemMemberIdentification2 clearingSystemMemberIdentification) {
		this.clearingSystemMemberIdentification = clearingSystemMemberIdentification;
	}

	@XmlElement(name = "Othr", required = true)
	public GenericFinancialIdentification1 getOther() {
		return other;
	}

	public void setOther(GenericFinancialIdentification1 other) {
		this.other = other;
	}
}