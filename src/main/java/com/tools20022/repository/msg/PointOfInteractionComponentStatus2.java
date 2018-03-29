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
import com.tools20022.repository.codeset.POIComponentStatus1Code;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.entity.SystemIdentification;
import com.tools20022.repository.entity.SystemStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status of a POI component (Point of Interaction).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus2#mmVersionNumber
 * PointOfInteractionComponentStatus2.mmVersionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus2#mmStatus
 * PointOfInteractionComponentStatus2.mmStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemStatus
 * SystemStatus}</li>
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
 * "PointOfInteractionComponentStatus2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a POI component (Point of Interaction)."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus3
 * PointOfInteractionComponentStatus3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus1
 * PointOfInteractionComponentStatus1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteractionComponentStatus2", propOrder = {"versionNumber", "status"})
public class PointOfInteractionComponentStatus2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "VrsnNb")
	protected Max256Text versionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmSystemVersion
	 * SystemIdentification.mmSystemVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus2
	 * PointOfInteractionComponentStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VrsnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current version of the component that might include the release number."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus3#mmVersionNumber
	 * PointOfInteractionComponentStatus3.mmVersionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus1#mmVersionNumber
	 * PointOfInteractionComponentStatus1.mmVersionNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentStatus2, Optional<Max256Text>> mmVersionNumber = new MMMessageAttribute<PointOfInteractionComponentStatus2, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> SystemIdentification.mmSystemVersion;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentStatus2.mmObject();
			isDerived = false;
			xmlTag = "VrsnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VersionNumber";
			definition = "Current version of the component that might include the release number.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponentStatus3.mmVersionNumber);
			previousVersion_lazy = () -> PointOfInteractionComponentStatus1.mmVersionNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(PointOfInteractionComponentStatus2 obj) {
			return obj.getVersionNumber();
		}

		@Override
		public void setValue(PointOfInteractionComponentStatus2 obj, Optional<Max256Text> value) {
			obj.setVersionNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts")
	protected POIComponentStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentStatus1Code
	 * POIComponentStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus#mmStatus
	 * SystemStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus2
	 * PointOfInteractionComponentStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of the component."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus3#mmStatus
	 * PointOfInteractionComponentStatus3.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus1#mmStatus
	 * PointOfInteractionComponentStatus1.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentStatus2, Optional<POIComponentStatus1Code>> mmStatus = new MMMessageAttribute<PointOfInteractionComponentStatus2, Optional<POIComponentStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> SystemStatus.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentStatus2.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Current status of the component.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponentStatus3.mmStatus);
			previousVersion_lazy = () -> PointOfInteractionComponentStatus1.mmStatus;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> POIComponentStatus1Code.mmObject();
		}

		@Override
		public Optional<POIComponentStatus1Code> getValue(PointOfInteractionComponentStatus2 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(PointOfInteractionComponentStatus2 obj, Optional<POIComponentStatus1Code> value) {
			obj.setStatus(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponentStatus2.mmVersionNumber, com.tools20022.repository.msg.PointOfInteractionComponentStatus2.mmStatus);
				trace_lazy = () -> SystemStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionComponentStatus2";
				definition = "Status of a POI component (Point of Interaction).";
				nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponentStatus3.mmObject());
				previousVersion_lazy = () -> PointOfInteractionComponentStatus1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max256Text> getVersionNumber() {
		return versionNumber == null ? Optional.empty() : Optional.of(versionNumber);
	}

	public PointOfInteractionComponentStatus2 setVersionNumber(Max256Text versionNumber) {
		this.versionNumber = versionNumber;
		return this;
	}

	public Optional<POIComponentStatus1Code> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public PointOfInteractionComponentStatus2 setStatus(POIComponentStatus1Code status) {
		this.status = status;
		return this;
	}
}