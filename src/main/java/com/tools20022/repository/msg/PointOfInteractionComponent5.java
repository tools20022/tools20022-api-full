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
import com.tools20022.repository.codeset.POIComponentType3Code;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.SystemStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5#mmType
 * PointOfInteractionComponent5.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5#mmIdentification
 * PointOfInteractionComponent5.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5#mmStatus
 * PointOfInteractionComponent5.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5#mmStandardCompliance
 * PointOfInteractionComponent5.mmStandardCompliance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5#mmCharacteristics
 * PointOfInteractionComponent5.mmCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5#mmAssessment
 * PointOfInteractionComponent5.mmAssessment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
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
 * "PointOfInteractionComponent5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Data related to a component of the POI (Point Of Interaction) performing the transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6
 * PointOfInteractionComponent6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4
 * PointOfInteractionComponent4}</li>
 * </ul>
 */
public class PointOfInteractionComponent5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected POIComponentType3Code type;
	/**
	 * Type of component belonging to a POI (Point Of Interaction) Terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentType3Code
	 * POIComponentType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5
	 * PointOfInteractionComponent5}</li>
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
	 * "Type of component belonging to a POI (Point Of Interaction) Terminal."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmType
	 * PointOfInteractionComponent6.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4#mmType
	 * PointOfInteractionComponent4.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponent5.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of component belonging to a POI (Point Of Interaction) Terminal.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent6.mmType);
			previousVersion_lazy = () -> PointOfInteractionComponent4.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> POIComponentType3Code.mmObject();
		}
	};
	protected PointOfInteractionComponentIdentification1 identification;
	/**
	 * Identification of the POI (Point Of Interaction) component.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5
	 * PointOfInteractionComponent5}</li>
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
	 * "Identification of the POI (Point Of Interaction) component."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmIdentification
	 * PointOfInteractionComponent6.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4#mmIdentification
	 * PointOfInteractionComponent4.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponent5.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the POI (Point Of Interaction) component.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent6.mmIdentification);
			previousVersion_lazy = () -> PointOfInteractionComponent4.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentIdentification1.mmObject();
		}
	};
	protected PointOfInteractionComponentStatus2 status;
	/**
	 * Status of the POI (Point Of Interaction) component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus2
	 * PointOfInteractionComponentStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus SystemStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5
	 * PointOfInteractionComponent5}</li>
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
	 * definition} = "Status of the POI (Point Of Interaction) component."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmStatus
	 * PointOfInteractionComponent6.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4#mmStatus
	 * PointOfInteractionComponent4.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SystemStatus.mmObject();
			componentContext_lazy = () -> PointOfInteractionComponent5.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the POI (Point Of Interaction) component.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent6.mmStatus);
			previousVersion_lazy = () -> PointOfInteractionComponent4.mmStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentStatus2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericIdentification48> standardCompliance;
	/**
	 * Identification of the standard for which the component complies with.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5
	 * PointOfInteractionComponent5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdCmplc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardCompliance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the standard for which the component complies with."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmStandardCompliance
	 * PointOfInteractionComponent6.mmStandardCompliance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4#mmStandardCompliance
	 * PointOfInteractionComponent4.mmStandardCompliance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStandardCompliance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponent5.mmObject();
			isDerived = false;
			xmlTag = "StdCmplc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardCompliance";
			definition = "Identification of the standard for which the component complies with.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent6.mmStandardCompliance);
			previousVersion_lazy = () -> PointOfInteractionComponent4.mmStandardCompliance;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.GenericIdentification48.mmObject();
		}
	};
	protected PointOfInteractionComponentCharacteristics2 characteristics;
	/**
	 * Characteristics of a POI (Point Of Interaction) component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2
	 * PointOfInteractionComponentCharacteristics2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5
	 * PointOfInteractionComponent5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Characteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Characteristics of a POI (Point Of Interaction) component."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmCharacteristics
	 * PointOfInteractionComponent6.mmCharacteristics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4#mmCharacteristics
	 * PointOfInteractionComponent4.mmCharacteristics}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCharacteristics = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponent5.mmObject();
			isDerived = false;
			xmlTag = "Chrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Characteristics";
			definition = "Characteristics of a POI (Point Of Interaction) component.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent6.mmCharacteristics);
			previousVersion_lazy = () -> PointOfInteractionComponent4.mmCharacteristics;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PointOfInteractionComponentAssessment1> assessment;
	/**
	 * Assessments for the component of the point of interaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent5
	 * PointOfInteractionComponent5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assessment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assessments for the component of the point of interaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent6#mmAssessment
	 * PointOfInteractionComponent6.mmAssessment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent4#mmAssessment
	 * PointOfInteractionComponent4.mmAssessment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAssessment = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponent5.mmObject();
			isDerived = false;
			xmlTag = "Assmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assessment";
			definition = "Assessments for the component of the point of interaction.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent6.mmAssessment);
			previousVersion_lazy = () -> PointOfInteractionComponent4.mmAssessment;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PointOfInteractionComponent5.mmType, PointOfInteractionComponent5.mmIdentification, PointOfInteractionComponent5.mmStatus, PointOfInteractionComponent5.mmStandardCompliance,
						PointOfInteractionComponent5.mmCharacteristics, PointOfInteractionComponent5.mmAssessment);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionComponent5";
				definition = "Data related to a component of the POI (Point Of Interaction) performing the transaction.";
				nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponent6.mmObject());
				previousVersion_lazy = () -> PointOfInteractionComponent4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public POIComponentType3Code getType() {
		return type;
	}

	public void setType(POIComponentType3Code type) {
		this.type = type;
	}

	public PointOfInteractionComponentIdentification1 getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.msg.PointOfInteractionComponentIdentification1 identification) {
		this.identification = identification;
	}

	public PointOfInteractionComponentStatus2 getStatus() {
		return status;
	}

	public void setStatus(com.tools20022.repository.msg.PointOfInteractionComponentStatus2 status) {
		this.status = status;
	}

	public List<GenericIdentification48> getStandardCompliance() {
		return standardCompliance;
	}

	public void setStandardCompliance(List<com.tools20022.repository.msg.GenericIdentification48> standardCompliance) {
		this.standardCompliance = standardCompliance;
	}

	public PointOfInteractionComponentCharacteristics2 getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2 characteristics) {
		this.characteristics = characteristics;
	}

	public List<PointOfInteractionComponentAssessment1> getAssessment() {
		return assessment;
	}

	public void setAssessment(List<com.tools20022.repository.msg.PointOfInteractionComponentAssessment1> assessment) {
		this.assessment = assessment;
	}
}