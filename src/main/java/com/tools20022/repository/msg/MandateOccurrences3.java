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
import com.tools20022.repository.choice.Frequency21Choice;
import com.tools20022.repository.codeset.SequenceType2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.PaymentProcessing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DatePeriodDetails1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details related to the duration of the mandate and the
 * occurrence of the underlying transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#mmSequenceType
 * MandateOccurrences3.mmSequenceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#mmFrequency
 * MandateOccurrences3.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateOccurrences3#mmDuration
 * MandateOccurrences3.mmDuration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#mmFirstCollectionDate
 * MandateOccurrences3.mmFirstCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3#mmFinalCollectionDate
 * MandateOccurrences3.mmFinalCollectionDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateOccurrences3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details related to the duration of the mandate and the occurrence of the underlying transactions."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MandateOccurrences4
 * MandateOccurrences4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2
 * MandateOccurrences2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateOccurrences3", propOrder = {"sequenceType", "frequency", "duration", "firstCollectionDate", "finalCollectionDate"})
public class MandateOccurrences3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SeqTp", required = true)
	protected SequenceType2Code sequenceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SequenceType2Code
	 * SequenceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmSequenceType
	 * PaymentProcessing.mmSequenceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3
	 * MandateOccurrences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the underlying transaction sequence as either recurring or one-off."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmSequenceType
	 * MandateOccurrences4.mmSequenceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#mmSequenceType
	 * MandateOccurrences2.mmSequenceType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateOccurrences3, SequenceType2Code> mmSequenceType = new MMMessageAttribute<MandateOccurrences3, SequenceType2Code>() {
		{
			businessElementTrace_lazy = () -> PaymentProcessing.mmSequenceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateOccurrences3.mmObject();
			isDerived = false;
			xmlTag = "SeqTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceType";
			definition = "Identifies the underlying transaction sequence as either recurring or one-off.";
			nextVersions_lazy = () -> Arrays.asList(MandateOccurrences4.mmSequenceType);
			previousVersion_lazy = () -> MandateOccurrences2.mmSequenceType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SequenceType2Code.mmObject();
		}

		@Override
		public SequenceType2Code getValue(MandateOccurrences3 obj) {
			return obj.getSequenceType();
		}

		@Override
		public void setValue(MandateOccurrences3 obj, SequenceType2Code value) {
			obj.setSequenceType(value);
		}
	};
	@XmlElement(name = "Frqcy")
	protected Frequency21Choice frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency21Choice
	 * Frequency21Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
	 * DirectDebitMandate.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3
	 * MandateOccurrences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regularity with which instructions are to be created and processed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmFrequency
	 * MandateOccurrences4.mmFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#mmFrequency
	 * MandateOccurrences2.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateOccurrences3, Optional<Frequency21Choice>> mmFrequency = new MMMessageAttribute<MandateOccurrences3, Optional<Frequency21Choice>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateOccurrences3.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Regularity with which instructions are to be created and processed.";
			nextVersions_lazy = () -> Arrays.asList(MandateOccurrences4.mmFrequency);
			previousVersion_lazy = () -> MandateOccurrences2.mmFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency21Choice.mmObject();
		}

		@Override
		public Optional<Frequency21Choice> getValue(MandateOccurrences3 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(MandateOccurrences3 obj, Optional<Frequency21Choice> value) {
			obj.setFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "Drtn")
	protected DatePeriodDetails1 duration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails1
	 * DatePeriodDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmValidityPeriod
	 * Agreement.mmValidityPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3
	 * MandateOccurrences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Drtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Length of time for which the mandate remains valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmDuration
	 * MandateOccurrences4.mmDuration}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#mmDuration
	 * MandateOccurrences2.mmDuration}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateOccurrences3, Optional<DatePeriodDetails1>> mmDuration = new MMMessageAttribute<MandateOccurrences3, Optional<DatePeriodDetails1>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmValidityPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateOccurrences3.mmObject();
			isDerived = false;
			xmlTag = "Drtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Duration";
			definition = "Length of time for which the mandate remains valid.";
			nextVersions_lazy = () -> Arrays.asList(MandateOccurrences4.mmDuration);
			previousVersion_lazy = () -> MandateOccurrences2.mmDuration;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DatePeriodDetails1.mmObject();
		}

		@Override
		public Optional<DatePeriodDetails1> getValue(MandateOccurrences3 obj) {
			return obj.getDuration();
		}

		@Override
		public void setValue(MandateOccurrences3 obj, Optional<DatePeriodDetails1> value) {
			obj.setDuration(value.orElse(null));
		}
	};
	@XmlElement(name = "FrstColltnDt")
	protected ISODate firstCollectionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFirstCollectionDate
	 * DirectDebitMandate.mmFirstCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3
	 * MandateOccurrences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstColltnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the first collection of a direct debit as per the mandate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmFirstCollectionDate
	 * MandateOccurrences4.mmFirstCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#mmFirstCollectionDate
	 * MandateOccurrences2.mmFirstCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateOccurrences3, Optional<ISODate>> mmFirstCollectionDate = new MMMessageAttribute<MandateOccurrences3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFirstCollectionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateOccurrences3.mmObject();
			isDerived = false;
			xmlTag = "FrstColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			nextVersions_lazy = () -> Arrays.asList(MandateOccurrences4.mmFirstCollectionDate);
			previousVersion_lazy = () -> MandateOccurrences2.mmFirstCollectionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MandateOccurrences3 obj) {
			return obj.getFirstCollectionDate();
		}

		@Override
		public void setValue(MandateOccurrences3 obj, Optional<ISODate> value) {
			obj.setFirstCollectionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FnlColltnDt")
	protected ISODate finalCollectionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFinalCollectionDate
	 * DirectDebitMandate.mmFinalCollectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences3
	 * MandateOccurrences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlColltnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the final collection of a direct debit as per the mandate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences4#mmFinalCollectionDate
	 * MandateOccurrences4.mmFinalCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateOccurrences2#mmFinalCollectionDate
	 * MandateOccurrences2.mmFinalCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateOccurrences3, Optional<ISODate>> mmFinalCollectionDate = new MMMessageAttribute<MandateOccurrences3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFinalCollectionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateOccurrences3.mmObject();
			isDerived = false;
			xmlTag = "FnlColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			nextVersions_lazy = () -> Arrays.asList(MandateOccurrences4.mmFinalCollectionDate);
			previousVersion_lazy = () -> MandateOccurrences2.mmFinalCollectionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MandateOccurrences3 obj) {
			return obj.getFinalCollectionDate();
		}

		@Override
		public void setValue(MandateOccurrences3 obj, Optional<ISODate> value) {
			obj.setFinalCollectionDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateOccurrences3.mmSequenceType, com.tools20022.repository.msg.MandateOccurrences3.mmFrequency,
						com.tools20022.repository.msg.MandateOccurrences3.mmDuration, com.tools20022.repository.msg.MandateOccurrences3.mmFirstCollectionDate, com.tools20022.repository.msg.MandateOccurrences3.mmFinalCollectionDate);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateOccurrences3";
				definition = "Provides further details related to the duration of the mandate and the occurrence of the underlying transactions.";
				nextVersions_lazy = () -> Arrays.asList(MandateOccurrences4.mmObject());
				previousVersion_lazy = () -> MandateOccurrences2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SequenceType2Code getSequenceType() {
		return sequenceType;
	}

	public MandateOccurrences3 setSequenceType(SequenceType2Code sequenceType) {
		this.sequenceType = Objects.requireNonNull(sequenceType);
		return this;
	}

	public Optional<Frequency21Choice> getFrequency() {
		return frequency == null ? Optional.empty() : Optional.of(frequency);
	}

	public MandateOccurrences3 setFrequency(Frequency21Choice frequency) {
		this.frequency = frequency;
		return this;
	}

	public Optional<DatePeriodDetails1> getDuration() {
		return duration == null ? Optional.empty() : Optional.of(duration);
	}

	public MandateOccurrences3 setDuration(DatePeriodDetails1 duration) {
		this.duration = duration;
		return this;
	}

	public Optional<ISODate> getFirstCollectionDate() {
		return firstCollectionDate == null ? Optional.empty() : Optional.of(firstCollectionDate);
	}

	public MandateOccurrences3 setFirstCollectionDate(ISODate firstCollectionDate) {
		this.firstCollectionDate = firstCollectionDate;
		return this;
	}

	public Optional<ISODate> getFinalCollectionDate() {
		return finalCollectionDate == null ? Optional.empty() : Optional.of(finalCollectionDate);
	}

	public MandateOccurrences3 setFinalCollectionDate(ISODate finalCollectionDate) {
		this.finalCollectionDate = finalCollectionDate;
		return this;
	}
}