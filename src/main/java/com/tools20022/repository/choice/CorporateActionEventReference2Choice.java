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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.CorporateActionEventRegistration;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a corporate action identification or a corporate action
 * official identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference2Choice#mmLinkedOfficialCorporateActionEventIdentification
 * CorporateActionEventReference2Choice.
 * mmLinkedOfficialCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference2Choice#mmLinkedCorporateActionIdentification
 * CorporateActionEventReference2Choice.mmLinkedCorporateActionIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
 * CorporateActionEventRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventReference2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a corporate action identification or a corporate action official identification."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionEventReference2Choice", propOrder = {"linkedOfficialCorporateActionEventIdentification", "linkedCorporateActionIdentification"})
public class CorporateActionEventReference2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected RestrictedFINXMax16Text linkedOfficialCorporateActionEventIdentification;
	/**
	 * Official and unique reference assigned by the official central body/
	 * entity within each market at the beginning of a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialCorporateActionEventIdentification
	 * CorporateActionEventRegistration.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference2Choice
	 * CorporateActionEventReference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdOffclCorpActnEvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedOfficialCorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Official and unique reference assigned by the official central body/ entity within each market at the beginning of a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkedOfficialCorporateActionEventIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmOfficialCorporateActionEventIdentification;
			componentContext_lazy = () -> CorporateActionEventReference2Choice.mmObject();
			isDerived = false;
			xmlTag = "LkdOffclCorpActnEvtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedOfficialCorporateActionEventIdentification";
			definition = "Official and unique reference assigned by the official central body/ entity within each market at the beginning of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text linkedCorporateActionIdentification;
	/**
	 * Reference assigned by the account servicer to unambiguously identify a
	 * related corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference2Choice
	 * CorporateActionEventReference2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdCorpActnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedCorporateActionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by the account servicer to unambiguously identify a related corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkedCorporateActionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> CorporateActionEventReference2Choice.mmObject();
			isDerived = false;
			xmlTag = "LkdCorpActnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedCorporateActionIdentification";
			definition = "Reference assigned by the account servicer to unambiguously identify a related corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionEventReference2Choice.mmLinkedOfficialCorporateActionEventIdentification, CorporateActionEventReference2Choice.mmLinkedCorporateActionIdentification);
				trace_lazy = () -> CorporateActionEventRegistration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateActionEventReference2Choice";
				definition = "Choice between a corporate action identification or a corporate action official identification.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "LkdOffclCorpActnEvtId", required = true)
	public RestrictedFINXMax16Text getLinkedOfficialCorporateActionEventIdentification() {
		return linkedOfficialCorporateActionEventIdentification;
	}

	public void setLinkedOfficialCorporateActionEventIdentification(RestrictedFINXMax16Text linkedOfficialCorporateActionEventIdentification) {
		this.linkedOfficialCorporateActionEventIdentification = linkedOfficialCorporateActionEventIdentification;
	}

	@XmlElement(name = "LkdCorpActnId", required = true)
	public RestrictedFINXMax16Text getLinkedCorporateActionIdentification() {
		return linkedCorporateActionIdentification;
	}

	public void setLinkedCorporateActionIdentification(RestrictedFINXMax16Text linkedCorporateActionIdentification) {
		this.linkedCorporateActionIdentification = linkedCorporateActionIdentification;
	}
}