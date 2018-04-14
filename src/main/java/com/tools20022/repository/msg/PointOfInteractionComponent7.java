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
import com.tools20022.repository.codeset.POIComponentType4Code;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.SystemStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related to a component of the POI (Point Of Interaction) performing the
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7#mmType
 * PointOfInteractionComponent7.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7#mmIdentification
 * PointOfInteractionComponent7.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7#mmStatus
 * PointOfInteractionComponent7.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7#mmStandardCompliance
 * PointOfInteractionComponent7.mmStandardCompliance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7#mmCharacteristics
 * PointOfInteractionComponent7.mmCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7#mmAssessment
 * PointOfInteractionComponent7.mmAssessment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PointOfInteractionComponent7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Data related to a component of the POI (Point Of Interaction) performing the transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent8
 * PointOfInteractionComponent8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6
 * PointOfInteractionComponent6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteractionComponent7", propOrder = {"type", "identification", "status", "standardCompliance", "characteristics", "assessment"})
public class PointOfInteractionComponent7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected POIComponentType4Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType4Code
	 * POIComponentType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
	 * PointOfInteractionComponent7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of component belonging to a POI (Point Of Interaction) Terminal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent8#mmType
	 * PointOfInteractionComponent8.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmType
	 * PointOfInteractionComponent6.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent7, POIComponentType4Code> mmType = new MMMessageAttribute<PointOfInteractionComponent7, POIComponentType4Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponent7.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of component belonging to a POI (Point Of Interaction) Terminal.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent8.mmType);
			previousVersion_lazy = () -> PointOfInteractionComponent6.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> POIComponentType4Code.mmObject();
		}

		@Override
		public POIComponentType4Code getValue(PointOfInteractionComponent7 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(PointOfInteractionComponent7 obj, POIComponentType4Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Id", required = true)
	protected PointOfInteractionComponentIdentification1 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentIdentification1
	 * PointOfInteractionComponentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
	 * PointOfInteractionComponent7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the POI (Point Of Interaction) component."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent8#mmIdentification
	 * PointOfInteractionComponent8.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmIdentification
	 * PointOfInteractionComponent6.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent7, PointOfInteractionComponentIdentification1> mmIdentification = new MMMessageAttribute<PointOfInteractionComponent7, PointOfInteractionComponentIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponent7.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the POI (Point Of Interaction) component.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent8.mmIdentification);
			previousVersion_lazy = () -> PointOfInteractionComponent6.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PointOfInteractionComponentIdentification1.mmObject();
		}

		@Override
		public PointOfInteractionComponentIdentification1 getValue(PointOfInteractionComponent7 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PointOfInteractionComponent7 obj, PointOfInteractionComponentIdentification1 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Sts")
	protected PointOfInteractionComponentStatus3 status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus3
	 * PointOfInteractionComponentStatus3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
	 * PointOfInteractionComponent7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the POI (Point Of Interaction) component."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent8#mmStatus
	 * PointOfInteractionComponent8.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmStatus
	 * PointOfInteractionComponent6.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent7, Optional<PointOfInteractionComponentStatus3>> mmStatus = new MMMessageAttribute<PointOfInteractionComponent7, Optional<PointOfInteractionComponentStatus3>>() {
		{
			businessComponentTrace_lazy = () -> SystemStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponent7.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the POI (Point Of Interaction) component.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent8.mmStatus);
			previousVersion_lazy = () -> PointOfInteractionComponent6.mmStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PointOfInteractionComponentStatus3.mmObject();
		}

		@Override
		public Optional<PointOfInteractionComponentStatus3> getValue(PointOfInteractionComponent7 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(PointOfInteractionComponent7 obj, Optional<PointOfInteractionComponentStatus3> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "StdCmplc")
	protected List<GenericIdentification48> standardCompliance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification48
	 * GenericIdentification48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
	 * PointOfInteractionComponent7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdCmplc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardCompliance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the standard for which the component complies with."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent8#mmStandardCompliance
	 * PointOfInteractionComponent8.mmStandardCompliance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmStandardCompliance
	 * PointOfInteractionComponent6.mmStandardCompliance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent7, List<GenericIdentification48>> mmStandardCompliance = new MMMessageAttribute<PointOfInteractionComponent7, List<GenericIdentification48>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponent7.mmObject();
			isDerived = false;
			xmlTag = "StdCmplc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardCompliance";
			definition = "Identification of the standard for which the component complies with.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent8.mmStandardCompliance);
			previousVersion_lazy = () -> PointOfInteractionComponent6.mmStandardCompliance;
			minOccurs = 0;
			complexType_lazy = () -> GenericIdentification48.mmObject();
		}

		@Override
		public List<GenericIdentification48> getValue(PointOfInteractionComponent7 obj) {
			return obj.getStandardCompliance();
		}

		@Override
		public void setValue(PointOfInteractionComponent7 obj, List<GenericIdentification48> value) {
			obj.setStandardCompliance(value);
		}
	};
	@XmlElement(name = "Chrtcs")
	protected PointOfInteractionComponentCharacteristics3 characteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
	 * PointOfInteractionComponent7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrtcs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Characteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Characteristics of a POI (Point Of Interaction) component."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent8#mmCharacteristics
	 * PointOfInteractionComponent8.mmCharacteristics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmCharacteristics
	 * PointOfInteractionComponent6.mmCharacteristics}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent7, Optional<PointOfInteractionComponentCharacteristics3>> mmCharacteristics = new MMMessageAttribute<PointOfInteractionComponent7, Optional<PointOfInteractionComponentCharacteristics3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponent7.mmObject();
			isDerived = false;
			xmlTag = "Chrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Characteristics";
			definition = "Characteristics of a POI (Point Of Interaction) component.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent8.mmCharacteristics);
			previousVersion_lazy = () -> PointOfInteractionComponent6.mmCharacteristics;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PointOfInteractionComponentCharacteristics3.mmObject();
		}

		@Override
		public Optional<PointOfInteractionComponentCharacteristics3> getValue(PointOfInteractionComponent7 obj) {
			return obj.getCharacteristics();
		}

		@Override
		public void setValue(PointOfInteractionComponent7 obj, Optional<PointOfInteractionComponentCharacteristics3> value) {
			obj.setCharacteristics(value.orElse(null));
		}
	};
	@XmlElement(name = "Assmnt")
	protected List<PointOfInteractionComponentAssessment1> assessment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1
	 * PointOfInteractionComponentAssessment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent7
	 * PointOfInteractionComponent7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assessment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assessments for the component of the point of interaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent8#mmAssessment
	 * PointOfInteractionComponent8.mmAssessment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmAssessment
	 * PointOfInteractionComponent6.mmAssessment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponent7, List<PointOfInteractionComponentAssessment1>> mmAssessment = new MMMessageAttribute<PointOfInteractionComponent7, List<PointOfInteractionComponentAssessment1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponent7.mmObject();
			isDerived = false;
			xmlTag = "Assmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assessment";
			definition = "Assessments for the component of the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent8.mmAssessment);
			previousVersion_lazy = () -> PointOfInteractionComponent6.mmAssessment;
			minOccurs = 0;
			complexType_lazy = () -> PointOfInteractionComponentAssessment1.mmObject();
		}

		@Override
		public List<PointOfInteractionComponentAssessment1> getValue(PointOfInteractionComponent7 obj) {
			return obj.getAssessment();
		}

		@Override
		public void setValue(PointOfInteractionComponent7 obj, List<PointOfInteractionComponentAssessment1> value) {
			obj.setAssessment(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponent7.mmType, com.tools20022.repository.msg.PointOfInteractionComponent7.mmIdentification,
						com.tools20022.repository.msg.PointOfInteractionComponent7.mmStatus, com.tools20022.repository.msg.PointOfInteractionComponent7.mmStandardCompliance,
						com.tools20022.repository.msg.PointOfInteractionComponent7.mmCharacteristics, com.tools20022.repository.msg.PointOfInteractionComponent7.mmAssessment);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionComponent7";
				definition = "Data related to a component of the POI (Point Of Interaction) performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent8.mmObject());
				previousVersion_lazy = () -> PointOfInteractionComponent6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public POIComponentType4Code getType() {
		return type;
	}

	public PointOfInteractionComponent7 setType(POIComponentType4Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public PointOfInteractionComponentIdentification1 getIdentification() {
		return identification;
	}

	public PointOfInteractionComponent7 setIdentification(PointOfInteractionComponentIdentification1 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<PointOfInteractionComponentStatus3> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public PointOfInteractionComponent7 setStatus(PointOfInteractionComponentStatus3 status) {
		this.status = status;
		return this;
	}

	public List<GenericIdentification48> getStandardCompliance() {
		return standardCompliance == null ? standardCompliance = new ArrayList<>() : standardCompliance;
	}

	public PointOfInteractionComponent7 setStandardCompliance(List<GenericIdentification48> standardCompliance) {
		this.standardCompliance = Objects.requireNonNull(standardCompliance);
		return this;
	}

	public Optional<PointOfInteractionComponentCharacteristics3> getCharacteristics() {
		return characteristics == null ? Optional.empty() : Optional.of(characteristics);
	}

	public PointOfInteractionComponent7 setCharacteristics(PointOfInteractionComponentCharacteristics3 characteristics) {
		this.characteristics = characteristics;
		return this;
	}

	public List<PointOfInteractionComponentAssessment1> getAssessment() {
		return assessment == null ? assessment = new ArrayList<>() : assessment;
	}

	public PointOfInteractionComponent7 setAssessment(List<PointOfInteractionComponentAssessment1> assessment) {
		this.assessment = Objects.requireNonNull(assessment);
		return this;
	}
}