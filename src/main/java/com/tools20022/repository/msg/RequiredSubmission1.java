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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.FinancialInstitution;
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
 * Specifies per transaction which document must be submitted and under which
 * conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission1#mmLatestMatchDate
 * RequiredSubmission1.mmLatestMatchDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission1#mmRequiredCommercialDataSet
 * RequiredSubmission1.mmRequiredCommercialDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission1#mmRequiredTransportDataSet
 * RequiredSubmission1.mmRequiredTransportDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequiredSubmission1#mmSubmitter
 * RequiredSubmission1.mmSubmitter}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRequiredTransportDataSetRule#forRequiredSubmission1
 * ConstraintRequiredTransportDataSetRule.forRequiredSubmission1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequiredSubmission1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies per transaction which document must be submitted and under which conditions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequiredSubmission1", propOrder = {"latestMatchDate", "requiredCommercialDataSet", "requiredTransportDataSet", "submitter"})
public class RequiredSubmission1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LatstMtchDt")
	protected ISODate latestMatchDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission1
	 * RequiredSubmission1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LatstMtchDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatestMatchDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the latest date on which a data set must be matched with a baseline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLatestMatchDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission1.mmObject();
			isDerived = false;
			xmlTag = "LatstMtchDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatestMatchDate";
			definition = "Specifies the latest date on which a data set must be matched with a baseline.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "ReqrdComrclDataSet", required = true)
	protected YesNoIndicator requiredCommercialDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission1
	 * RequiredSubmission1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdComrclDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredCommercialDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the commercial documents must be submitted for the current transaction or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequiredCommercialDataSet = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission1.mmObject();
			isDerived = false;
			xmlTag = "ReqrdComrclDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredCommercialDataSet";
			definition = "Specifies whether the commercial documents must be submitted for the current transaction or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "ReqrdTrnsprtDataSet", required = true)
	protected YesNoIndicator requiredTransportDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission1
	 * RequiredSubmission1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdTrnsprtDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredTransportDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transport documents must be submitted for the current transaction or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequiredTransportDataSet = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission1.mmObject();
			isDerived = false;
			xmlTag = "ReqrdTrnsprtDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredTransportDataSet";
			definition = "Specifies whether the transport documents must be submitted for the current transaction or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "Submitr", required = true)
	protected BICIdentification1 submitter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialInstitution
	 * FinancialInstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission1
	 * RequiredSubmission1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Submitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Submitter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the party that must submit the data sets."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubmitter = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialInstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RequiredSubmission1.mmObject();
			isDerived = false;
			xmlTag = "Submitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Submitter";
			definition = "Specifies the party that must submit the data sets.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BICIdentification1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RequiredSubmission1.mmLatestMatchDate, com.tools20022.repository.msg.RequiredSubmission1.mmRequiredCommercialDataSet,
						com.tools20022.repository.msg.RequiredSubmission1.mmRequiredTransportDataSet, com.tools20022.repository.msg.RequiredSubmission1.mmSubmitter);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequiredTransportDataSetRule.forRequiredSubmission1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RequiredSubmission1";
				definition = "Specifies per transaction which document must be submitted and under which conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getLatestMatchDate() {
		return latestMatchDate == null ? Optional.empty() : Optional.of(latestMatchDate);
	}

	public RequiredSubmission1 setLatestMatchDate(ISODate latestMatchDate) {
		this.latestMatchDate = latestMatchDate;
		return this;
	}

	public YesNoIndicator getRequiredCommercialDataSet() {
		return requiredCommercialDataSet;
	}

	public RequiredSubmission1 setRequiredCommercialDataSet(YesNoIndicator requiredCommercialDataSet) {
		this.requiredCommercialDataSet = Objects.requireNonNull(requiredCommercialDataSet);
		return this;
	}

	public YesNoIndicator getRequiredTransportDataSet() {
		return requiredTransportDataSet;
	}

	public RequiredSubmission1 setRequiredTransportDataSet(YesNoIndicator requiredTransportDataSet) {
		this.requiredTransportDataSet = Objects.requireNonNull(requiredTransportDataSet);
		return this;
	}

	public BICIdentification1 getSubmitter() {
		return submitter;
	}

	public RequiredSubmission1 setSubmitter(com.tools20022.repository.msg.BICIdentification1 submitter) {
		this.submitter = Objects.requireNonNull(submitter);
		return this;
	}
}