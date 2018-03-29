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
import com.tools20022.repository.choice.Period4Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Instrument specific technical data to support identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3#mmInconsistencyIndicator
 * RecordTechnicalData3.mmInconsistencyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3#mmLastUpdate
 * RecordTechnicalData3.mmLastUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3#mmSubmissionDateTime
 * RecordTechnicalData3.mmSubmissionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3#mmRelevantCompetentAuthority
 * RecordTechnicalData3.mmRelevantCompetentAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3#mmPublicationPeriod
 * RecordTechnicalData3.mmPublicationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3#mmNeverPublished
 * RecordTechnicalData3.mmNeverPublished}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOneElementPresentRule#forRecordTechnicalData3
 * ConstraintOneElementPresentRule.forRecordTechnicalData3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RecordTechnicalData3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Instrument specific technical data to support identification."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData2
 * RecordTechnicalData2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RecordTechnicalData3", propOrder = {"inconsistencyIndicator", "lastUpdate", "submissionDateTime", "relevantCompetentAuthority", "publicationPeriod", "neverPublished"})
public class RecordTechnicalData3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IncnsstncyInd")
	protected TrueFalseIndicator inconsistencyIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3
	 * RecordTechnicalData3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncnsstncyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InconsistencyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag to say if there is an inconsistency across all submitting entities records."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecordTechnicalData3, Optional<TrueFalseIndicator>> mmInconsistencyIndicator = new MMMessageAttribute<RecordTechnicalData3, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData3.mmObject();
			isDerived = false;
			xmlTag = "IncnsstncyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InconsistencyIndicator";
			definition = "Flag to say if there is an inconsistency across all submitting entities records.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(RecordTechnicalData3 obj) {
			return obj.getInconsistencyIndicator();
		}

		@Override
		public void setValue(RecordTechnicalData3 obj, Optional<TrueFalseIndicator> value) {
			obj.setInconsistencyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "LastUpd")
	protected ISODateTime lastUpdate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3
	 * RecordTechnicalData3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastUpd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date for which data was received for this instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecordTechnicalData3, Optional<ISODateTime>> mmLastUpdate = new MMMessageAttribute<RecordTechnicalData3, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData3.mmObject();
			isDerived = false;
			xmlTag = "LastUpd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastUpdate";
			definition = "Last date for which data was received for this instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(RecordTechnicalData3 obj) {
			return obj.getLastUpdate();
		}

		@Override
		public void setValue(RecordTechnicalData3 obj, Optional<ISODateTime> value) {
			obj.setLastUpdate(value.orElse(null));
		}
	};
	@XmlElement(name = "SubmissnDtTm")
	protected ISODateTime submissionDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3
	 * RecordTechnicalData3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmissnDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the date and time when this instrument was originally received at the submission destination."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecordTechnicalData3, Optional<ISODateTime>> mmSubmissionDateTime = new MMMessageAttribute<RecordTechnicalData3, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData3.mmObject();
			isDerived = false;
			xmlTag = "SubmissnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionDateTime";
			definition = "Defines the date and time when this instrument was originally received at the submission destination.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(RecordTechnicalData3 obj) {
			return obj.getSubmissionDateTime();
		}

		@Override
		public void setValue(RecordTechnicalData3 obj, Optional<ISODateTime> value) {
			obj.setSubmissionDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "RlvntCmptntAuthrty")
	protected CountryCode relevantCompetentAuthority;
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
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3
	 * RecordTechnicalData3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RlvntCmptntAuthrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelevantCompetentAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country code of the relevant competent authority of the instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecordTechnicalData3, Optional<CountryCode>> mmRelevantCompetentAuthority = new MMMessageAttribute<RecordTechnicalData3, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData3.mmObject();
			isDerived = false;
			xmlTag = "RlvntCmptntAuthrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelevantCompetentAuthority";
			definition = "Country code of the relevant competent authority of the instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(RecordTechnicalData3 obj) {
			return obj.getRelevantCompetentAuthority();
		}

		@Override
		public void setValue(RecordTechnicalData3 obj, Optional<CountryCode> value) {
			obj.setRelevantCompetentAuthority(value.orElse(null));
		}
	};
	@XmlElement(name = "PblctnPrd")
	protected Period4Choice publicationPeriod;
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
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3
	 * RecordTechnicalData3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PblctnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period for which the associated instrument has been publically available."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RecordTechnicalData3, Optional<Period4Choice>> mmPublicationPeriod = new MMMessageAssociationEnd<RecordTechnicalData3, Optional<Period4Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData3.mmObject();
			isDerived = false;
			xmlTag = "PblctnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicationPeriod";
			definition = "Period for which the associated instrument has been publically available.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period4Choice.mmObject();
		}

		@Override
		public Optional<Period4Choice> getValue(RecordTechnicalData3 obj) {
			return obj.getPublicationPeriod();
		}

		@Override
		public void setValue(RecordTechnicalData3 obj, Optional<Period4Choice> value) {
			obj.setPublicationPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "NvrPblshd")
	protected TrueFalseIndicator neverPublished;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RecordTechnicalData3
	 * RecordTechnicalData3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NvrPblshd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NeverPublished"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Flag to say if the record has ever been published."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RecordTechnicalData3, Optional<TrueFalseIndicator>> mmNeverPublished = new MMMessageAttribute<RecordTechnicalData3, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RecordTechnicalData3.mmObject();
			isDerived = false;
			xmlTag = "NvrPblshd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NeverPublished";
			definition = "Flag to say if the record has ever been published.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(RecordTechnicalData3 obj) {
			return obj.getNeverPublished();
		}

		@Override
		public void setValue(RecordTechnicalData3 obj, Optional<TrueFalseIndicator> value) {
			obj.setNeverPublished(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RecordTechnicalData3.mmInconsistencyIndicator, com.tools20022.repository.msg.RecordTechnicalData3.mmLastUpdate,
						com.tools20022.repository.msg.RecordTechnicalData3.mmSubmissionDateTime, com.tools20022.repository.msg.RecordTechnicalData3.mmRelevantCompetentAuthority,
						com.tools20022.repository.msg.RecordTechnicalData3.mmPublicationPeriod, com.tools20022.repository.msg.RecordTechnicalData3.mmNeverPublished);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOneElementPresentRule.forRecordTechnicalData3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RecordTechnicalData3";
				definition = "Instrument specific technical data to support identification.";
				previousVersion_lazy = () -> RecordTechnicalData2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getInconsistencyIndicator() {
		return inconsistencyIndicator == null ? Optional.empty() : Optional.of(inconsistencyIndicator);
	}

	public RecordTechnicalData3 setInconsistencyIndicator(TrueFalseIndicator inconsistencyIndicator) {
		this.inconsistencyIndicator = inconsistencyIndicator;
		return this;
	}

	public Optional<ISODateTime> getLastUpdate() {
		return lastUpdate == null ? Optional.empty() : Optional.of(lastUpdate);
	}

	public RecordTechnicalData3 setLastUpdate(ISODateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
		return this;
	}

	public Optional<ISODateTime> getSubmissionDateTime() {
		return submissionDateTime == null ? Optional.empty() : Optional.of(submissionDateTime);
	}

	public RecordTechnicalData3 setSubmissionDateTime(ISODateTime submissionDateTime) {
		this.submissionDateTime = submissionDateTime;
		return this;
	}

	public Optional<CountryCode> getRelevantCompetentAuthority() {
		return relevantCompetentAuthority == null ? Optional.empty() : Optional.of(relevantCompetentAuthority);
	}

	public RecordTechnicalData3 setRelevantCompetentAuthority(CountryCode relevantCompetentAuthority) {
		this.relevantCompetentAuthority = relevantCompetentAuthority;
		return this;
	}

	public Optional<Period4Choice> getPublicationPeriod() {
		return publicationPeriod == null ? Optional.empty() : Optional.of(publicationPeriod);
	}

	public RecordTechnicalData3 setPublicationPeriod(Period4Choice publicationPeriod) {
		this.publicationPeriod = publicationPeriod;
		return this;
	}

	public Optional<TrueFalseIndicator> getNeverPublished() {
		return neverPublished == null ? Optional.empty() : Optional.of(neverPublished);
	}

	public RecordTechnicalData3 setNeverPublished(TrueFalseIndicator neverPublished) {
		this.neverPublished = neverPublished;
		return this;
	}
}