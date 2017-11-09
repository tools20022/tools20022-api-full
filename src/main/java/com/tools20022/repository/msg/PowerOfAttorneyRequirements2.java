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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.MeetingNotificationV02;
import com.tools20022.repository.area.seev.MeetingNotificationV03;
import com.tools20022.repository.area.seev.MeetingNotificationV04;
import com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.PowerOfAttorneyRequirements;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the conditions to be filled in to obtain a valid power of attorney.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements2#mmLegalRequirement
 * PowerOfAttorneyRequirements2.mmLegalRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements2#mmOtherDocumentation
 * PowerOfAttorneyRequirements2.mmOtherDocumentation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements
 * PowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmPowerOfAttorneyRequirements
 * MeetingNotificationV02.mmPowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmPowerOfAttorneyRequirements
 * MeetingNotificationV03.mmPowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmPowerOfAttorneyRequirements
 * MeetingNotificationV04.mmPowerOfAttorneyRequirements}</li>
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
 * "PowerOfAttorneyRequirements2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions to be filled in to obtain a valid power of attorney."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3
 * PowerOfAttorneyRequirements3}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class PowerOfAttorneyRequirements2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<PowerOfAttorneyLegalisation1Code> legalRequirement;
	/**
	 * Specifies whether the power of attorney needs to be validated by some
	 * authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code
	 * PowerOfAttorneyLegalisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmLegalRequirement
	 * PowerOfAttorneyRequirements.mmLegalRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements2
	 * PowerOfAttorneyRequirements2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRqrmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the power of attorney needs to be validated by some authority."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3#mmLegalRequirement
	 * PowerOfAttorneyRequirements3.mmLegalRequirement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalRequirement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PowerOfAttorneyRequirements.mmLegalRequirement;
			componentContext_lazy = () -> PowerOfAttorneyRequirements2.mmObject();
			isDerived = false;
			xmlTag = "LglRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRequirement";
			definition = "Specifies whether the power of attorney needs to be validated by some authority.";
			nextVersions_lazy = () -> Arrays.asList(PowerOfAttorneyRequirements3.mmLegalRequirement);
			maxOccurs = 4;
			minOccurs = 0;
			simpleType_lazy = () -> PowerOfAttorneyLegalisation1Code.mmObject();
		}
	};
	protected Max350Text otherDocumentation;
	/**
	 * Specifies the documents needed to obtain a valid power of attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmOtherDocumentation
	 * PowerOfAttorneyRequirements.mmOtherDocumentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements2
	 * PowerOfAttorneyRequirements2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDcmnttn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the documents needed to obtain a valid power of attorney."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3#mmOtherDocumentation
	 * PowerOfAttorneyRequirements3.mmOtherDocumentation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherDocumentation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PowerOfAttorneyRequirements.mmOtherDocumentation;
			componentContext_lazy = () -> PowerOfAttorneyRequirements2.mmObject();
			isDerived = false;
			xmlTag = "OthrDcmnttn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentation";
			definition = "Specifies the documents needed to obtain a valid power of attorney.";
			nextVersions_lazy = () -> Arrays.asList(PowerOfAttorneyRequirements3.mmOtherDocumentation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PowerOfAttorneyRequirements2.mmLegalRequirement, PowerOfAttorneyRequirements2.mmOtherDocumentation);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV02.mmPowerOfAttorneyRequirements, MeetingNotificationV03.mmPowerOfAttorneyRequirements, MeetingNotificationV04.mmPowerOfAttorneyRequirements);
				trace_lazy = () -> PowerOfAttorneyRequirements.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PowerOfAttorneyRequirements2";
				definition = "Specifies the conditions to be filled in to obtain a valid power of attorney.";
				nextVersions_lazy = () -> Arrays.asList(PowerOfAttorneyRequirements3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<PowerOfAttorneyLegalisation1Code> getLegalRequirement() {
		return legalRequirement;
	}

	public void setLegalRequirement(List<PowerOfAttorneyLegalisation1Code> legalRequirement) {
		this.legalRequirement = legalRequirement;
	}

	public Max350Text getOtherDocumentation() {
		return otherDocumentation;
	}

	public void setOtherDocumentation(Max350Text otherDocumentation) {
		this.otherDocumentation = otherDocumentation;
	}
}