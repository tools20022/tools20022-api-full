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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RecordTechnicalData3", propOrder = {"inconsistencyIndicator", "lastUpdate", "submissionDateTime", "relevantCompetentAuthority", "publicationPeriod", "neverPublished"})
public class RecordTechnicalData3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator inconsistencyIndicator;
	/**
	 * Flag to say if there is an inconsistency across all submitting entities
	 * records.
	 * <p>
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
	public static final MMMessageAttribute mmInconsistencyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RecordTechnicalData3.mmObject();
			isDerived = false;
			xmlTag = "IncnsstncyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InconsistencyIndicator";
			definition = "Flag to say if there is an inconsistency across all submitting entities records.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected ISODateTime lastUpdate;
	/**
	 * Last date for which data was received for this instrument.
	 * <p>
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
	public static final MMMessageAttribute mmLastUpdate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RecordTechnicalData3.mmObject();
			isDerived = false;
			xmlTag = "LastUpd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastUpdate";
			definition = "Last date for which data was received for this instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime submissionDateTime;
	/**
	 * Defines the date and time when this instrument was originally received at
	 * the submission destination.
	 * <p>
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
	public static final MMMessageAttribute mmSubmissionDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RecordTechnicalData3.mmObject();
			isDerived = false;
			xmlTag = "SubmissnDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionDateTime";
			definition = "Defines the date and time when this instrument was originally received at the submission destination.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected CountryCode relevantCompetentAuthority;
	/**
	 * Country code of the relevant competent authority of the instrument.
	 * <p>
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
	public static final MMMessageAttribute mmRelevantCompetentAuthority = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RecordTechnicalData3.mmObject();
			isDerived = false;
			xmlTag = "RlvntCmptntAuthrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelevantCompetentAuthority";
			definition = "Country code of the relevant competent authority of the instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Period4Choice publicationPeriod;
	/**
	 * Period for which the associated instrument has been publically available.
	 * <p>
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
	public static final MMMessageAssociationEnd mmPublicationPeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> RecordTechnicalData3.mmObject();
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
	};
	protected TrueFalseIndicator neverPublished;
	/**
	 * Flag to say if the record has ever been published.
	 * <p>
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
	public static final MMMessageAttribute mmNeverPublished = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RecordTechnicalData3.mmObject();
			isDerived = false;
			xmlTag = "NvrPblshd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NeverPublished";
			definition = "Flag to say if the record has ever been published.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RecordTechnicalData3.mmInconsistencyIndicator, RecordTechnicalData3.mmLastUpdate, RecordTechnicalData3.mmSubmissionDateTime, RecordTechnicalData3.mmRelevantCompetentAuthority,
						RecordTechnicalData3.mmPublicationPeriod, RecordTechnicalData3.mmNeverPublished);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RecordTechnicalData3";
				definition = "Instrument specific technical data to support identification.";
				previousVersion_lazy = () -> RecordTechnicalData2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "IncnsstncyInd")
	public TrueFalseIndicator getInconsistencyIndicator() {
		return inconsistencyIndicator;
	}

	public void setInconsistencyIndicator(TrueFalseIndicator inconsistencyIndicator) {
		this.inconsistencyIndicator = inconsistencyIndicator;
	}

	@XmlElement(name = "LastUpd")
	public ISODateTime getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(ISODateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@XmlElement(name = "SubmissnDtTm")
	public ISODateTime getSubmissionDateTime() {
		return submissionDateTime;
	}

	public void setSubmissionDateTime(ISODateTime submissionDateTime) {
		this.submissionDateTime = submissionDateTime;
	}

	@XmlElement(name = "RlvntCmptntAuthrty")
	public CountryCode getRelevantCompetentAuthority() {
		return relevantCompetentAuthority;
	}

	public void setRelevantCompetentAuthority(CountryCode relevantCompetentAuthority) {
		this.relevantCompetentAuthority = relevantCompetentAuthority;
	}

	@XmlElement(name = "PblctnPrd")
	public Period4Choice getPublicationPeriod() {
		return publicationPeriod;
	}

	public void setPublicationPeriod(Period4Choice publicationPeriod) {
		this.publicationPeriod = publicationPeriod;
	}

	@XmlElement(name = "NvrPblshd")
	public TrueFalseIndicator getNeverPublished() {
		return neverPublished;
	}

	public void setNeverPublished(TrueFalseIndicator neverPublished) {
		this.neverPublished = neverPublished;
	}
}