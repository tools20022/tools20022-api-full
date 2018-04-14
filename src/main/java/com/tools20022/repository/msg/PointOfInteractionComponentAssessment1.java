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
import com.tools20022.repository.codeset.POIComponentAssessment1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Assessment;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Assessments for the component of the point of interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1#mmType
 * PointOfInteractionComponentAssessment1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1#mmAssigner
 * PointOfInteractionComponentAssessment1.mmAssigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1#mmDeliveryDate
 * PointOfInteractionComponentAssessment1.mmDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1#mmExpirationDate
 * PointOfInteractionComponentAssessment1.mmExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1#mmNumber
 * PointOfInteractionComponentAssessment1.mmNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Assessment Assessment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PointOfInteractionComponentAssessment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Assessments for the component of the point of interaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteractionComponentAssessment1", propOrder = {"type", "assigner", "deliveryDate", "expirationDate", "number"})
public class PointOfInteractionComponentAssessment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected POIComponentAssessment1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentAssessment1Code
	 * POIComponentAssessment1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Assessment#mmAssessmentType
	 * Assessment.mmAssessmentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1
	 * PointOfInteractionComponentAssessment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of assessment of the component."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentAssessment1, POIComponentAssessment1Code> mmType = new MMMessageAttribute<PointOfInteractionComponentAssessment1, POIComponentAssessment1Code>() {
		{
			businessElementTrace_lazy = () -> Assessment.mmAssessmentType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of assessment of the component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> POIComponentAssessment1Code.mmObject();
		}

		@Override
		public POIComponentAssessment1Code getValue(PointOfInteractionComponentAssessment1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(PointOfInteractionComponentAssessment1 obj, POIComponentAssessment1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Assgnr", required = true)
	protected List<Max35Text> assigner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1
	 * PointOfInteractionComponentAssessment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assigner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Body which has delivered the assessment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentAssessment1, List<Max35Text>> mmAssigner = new MMMessageAttribute<PointOfInteractionComponentAssessment1, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.mmObject();
			isDerived = false;
			xmlTag = "Assgnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assigner";
			definition = "Body which has delivered the assessment.";
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(PointOfInteractionComponentAssessment1 obj) {
			return obj.getAssigner();
		}

		@Override
		public void setValue(PointOfInteractionComponentAssessment1 obj, List<Max35Text> value) {
			obj.setAssigner(value);
		}
	};
	@XmlElement(name = "DlvryDt")
	protected ISODateTime deliveryDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Assessment#mmDeliveryDate
	 * Assessment.mmDeliveryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1
	 * PointOfInteractionComponentAssessment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the assessment has been delivered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentAssessment1, Optional<ISODateTime>> mmDeliveryDate = new MMMessageAttribute<PointOfInteractionComponentAssessment1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Assessment.mmDeliveryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.mmObject();
			isDerived = false;
			xmlTag = "DlvryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDate";
			definition = "Date when the assessment has been delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(PointOfInteractionComponentAssessment1 obj) {
			return obj.getDeliveryDate();
		}

		@Override
		public void setValue(PointOfInteractionComponentAssessment1 obj, Optional<ISODateTime> value) {
			obj.setDeliveryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XprtnDt")
	protected ISODateTime expirationDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Assessment#mmExpiryDate
	 * Assessment.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1
	 * PointOfInteractionComponentAssessment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XprtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the assessment will expire."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentAssessment1, Optional<ISODateTime>> mmExpirationDate = new MMMessageAttribute<PointOfInteractionComponentAssessment1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Assessment.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.mmObject();
			isDerived = false;
			xmlTag = "XprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpirationDate";
			definition = "Date when the assessment will expire.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(PointOfInteractionComponentAssessment1 obj) {
			return obj.getExpirationDate();
		}

		@Override
		public void setValue(PointOfInteractionComponentAssessment1 obj, Optional<ISODateTime> value) {
			obj.setExpirationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Nb", required = true)
	protected Max35Text number;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentAssessment1
	 * PointOfInteractionComponentAssessment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique assessment number for the component."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentAssessment1, Max35Text> mmNumber = new MMMessageAttribute<PointOfInteractionComponentAssessment1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.mmObject();
			isDerived = false;
			xmlTag = "Nb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Number";
			definition = "Unique assessment number for the component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PointOfInteractionComponentAssessment1 obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(PointOfInteractionComponentAssessment1 obj, Max35Text value) {
			obj.setNumber(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.mmType, com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.mmAssigner,
						com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.mmDeliveryDate, com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.mmExpirationDate,
						com.tools20022.repository.msg.PointOfInteractionComponentAssessment1.mmNumber);
				trace_lazy = () -> Assessment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionComponentAssessment1";
				definition = "Assessments for the component of the point of interaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public POIComponentAssessment1Code getType() {
		return type;
	}

	public PointOfInteractionComponentAssessment1 setType(POIComponentAssessment1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public List<Max35Text> getAssigner() {
		return assigner == null ? assigner = new ArrayList<>() : assigner;
	}

	public PointOfInteractionComponentAssessment1 setAssigner(List<Max35Text> assigner) {
		this.assigner = Objects.requireNonNull(assigner);
		return this;
	}

	public Optional<ISODateTime> getDeliveryDate() {
		return deliveryDate == null ? Optional.empty() : Optional.of(deliveryDate);
	}

	public PointOfInteractionComponentAssessment1 setDeliveryDate(ISODateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
		return this;
	}

	public Optional<ISODateTime> getExpirationDate() {
		return expirationDate == null ? Optional.empty() : Optional.of(expirationDate);
	}

	public PointOfInteractionComponentAssessment1 setExpirationDate(ISODateTime expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	public Max35Text getNumber() {
		return number;
	}

	public PointOfInteractionComponentAssessment1 setNumber(Max35Text number) {
		this.number = Objects.requireNonNull(number);
		return this;
	}
}