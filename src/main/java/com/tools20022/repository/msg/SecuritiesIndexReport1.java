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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01;
import com.tools20022.repository.choice.FinancialInstrument46Choice;
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
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
 * Provides details on the securities index request operations for national
 * competent authorities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesIndexReport1#mmTechnicalRecordIdentification
 * SecuritiesIndexReport1.mmTechnicalRecordIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesIndexReport1#mmRequestingEntity
 * SecuritiesIndexReport1.mmRequestingEntity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesIndexReport1#mmIndex
 * SecuritiesIndexReport1.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesIndexReport1#mmValidityPeriod
 * SecuritiesIndexReport1.mmValidityPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataIndexReportV01#mmIndexData
 * FinancialInstrumentReportingReferenceDataIndexReportV01.mmIndexData}</li>
 * </ul>
 * </li>
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
 * "SecuritiesIndexReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the securities index request operations for national competent authorities."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesIndexReport1", propOrder = {"technicalRecordIdentification", "requestingEntity", "index", "validityPeriod"})
public class SecuritiesIndexReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TechRcrdId")
	protected Max35Text technicalRecordIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesIndexReport1
	 * SecuritiesIndexReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechRcrdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalRecordIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of a record in a message used as part of error management and feedback messages.\r\n\r\nUsage:\r\nThis identification will be used in the status advice sent back."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesIndexReport1, Optional<Max35Text>> mmTechnicalRecordIdentification = new MMMessageAttribute<SecuritiesIndexReport1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesIndexReport1.mmObject();
			isDerived = false;
			xmlTag = "TechRcrdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalRecordIdentification";
			definition = "Unique identifier of a record in a message used as part of error management and feedback messages.\r\n\r\nUsage:\r\nThis identification will be used in the status advice sent back.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecuritiesIndexReport1 obj) {
			return obj.getTechnicalRecordIdentification();
		}

		@Override
		public void setValue(SecuritiesIndexReport1 obj, Optional<Max35Text> value) {
			obj.setTechnicalRecordIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RqstngNtty")
	protected CountryCode requestingEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesIndexReport1
	 * SecuritiesIndexReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RqstngNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestingEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country code of the entity that wishes to express an interest in receiving transaction reports for the requested indexes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesIndexReport1, Optional<CountryCode>> mmRequestingEntity = new MMMessageAttribute<SecuritiesIndexReport1, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesIndexReport1.mmObject();
			isDerived = false;
			xmlTag = "RqstngNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestingEntity";
			definition = "Country code of the entity that wishes to express an interest in receiving transaction reports for the requested indexes.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(SecuritiesIndexReport1 obj) {
			return obj.getRequestingEntity();
		}

		@Override
		public void setValue(SecuritiesIndexReport1 obj, Optional<CountryCode> value) {
			obj.setRequestingEntity(value.orElse(null));
		}
	};
	@XmlElement(name = "Indx", required = true)
	protected FinancialInstrument46Choice index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrument46Choice
	 * FinancialInstrument46Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesIndexReport1
	 * SecuritiesIndexReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Indx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details the index that is being requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesIndexReport1, FinancialInstrument46Choice> mmIndex = new MMMessageAssociationEnd<SecuritiesIndexReport1, FinancialInstrument46Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesIndexReport1.mmObject();
			isDerived = false;
			xmlTag = "Indx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Details the index that is being requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument46Choice.mmObject();
		}

		@Override
		public FinancialInstrument46Choice getValue(SecuritiesIndexReport1 obj) {
			return obj.getIndex();
		}

		@Override
		public void setValue(SecuritiesIndexReport1 obj, FinancialInstrument46Choice value) {
			obj.setIndex(value);
		}
	};
	@XmlElement(name = "VldtyPrd")
	protected Period4Choice validityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Period4Choice
	 * Period4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesIndexReport1
	 * SecuritiesIndexReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date when the national competent authority last expressed its interest in this index."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesIndexReport1, Optional<Period4Choice>> mmValidityPeriod = new MMMessageAssociationEnd<SecuritiesIndexReport1, Optional<Period4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesIndexReport1.mmObject();
			isDerived = false;
			xmlTag = "VldtyPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityPeriod";
			definition = "Date when the national competent authority last expressed its interest in this index.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period4Choice.mmObject();
		}

		@Override
		public Optional<Period4Choice> getValue(SecuritiesIndexReport1 obj) {
			return obj.getValidityPeriod();
		}

		@Override
		public void setValue(SecuritiesIndexReport1 obj, Optional<Period4Choice> value) {
			obj.setValidityPeriod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesIndexReport1.mmTechnicalRecordIdentification, com.tools20022.repository.msg.SecuritiesIndexReport1.mmRequestingEntity,
						com.tools20022.repository.msg.SecuritiesIndexReport1.mmIndex, com.tools20022.repository.msg.SecuritiesIndexReport1.mmValidityPeriod);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingReferenceDataIndexReportV01.mmIndexData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesIndexReport1";
				definition = "Provides details on the securities index request operations for national competent authorities.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTechnicalRecordIdentification() {
		return technicalRecordIdentification == null ? Optional.empty() : Optional.of(technicalRecordIdentification);
	}

	public SecuritiesIndexReport1 setTechnicalRecordIdentification(Max35Text technicalRecordIdentification) {
		this.technicalRecordIdentification = technicalRecordIdentification;
		return this;
	}

	public Optional<CountryCode> getRequestingEntity() {
		return requestingEntity == null ? Optional.empty() : Optional.of(requestingEntity);
	}

	public SecuritiesIndexReport1 setRequestingEntity(CountryCode requestingEntity) {
		this.requestingEntity = requestingEntity;
		return this;
	}

	public FinancialInstrument46Choice getIndex() {
		return index;
	}

	public SecuritiesIndexReport1 setIndex(FinancialInstrument46Choice index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public Optional<Period4Choice> getValidityPeriod() {
		return validityPeriod == null ? Optional.empty() : Optional.of(validityPeriod);
	}

	public SecuritiesIndexReport1 setValidityPeriod(Period4Choice validityPeriod) {
		this.validityPeriod = validityPeriod;
		return this;
	}
}