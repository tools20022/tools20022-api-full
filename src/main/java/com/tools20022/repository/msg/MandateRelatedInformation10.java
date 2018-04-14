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
import com.tools20022.repository.choice.Frequency21Choice;
import com.tools20022.repository.choice.MandateSetupReason1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.ElectronicSignature;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmendmentInformationDetails10;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details related to a direct debit mandate signed between the
 * creditor and the debtor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmMandateIdentification
 * MandateRelatedInformation10.mmMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmDateOfSignature
 * MandateRelatedInformation10.mmDateOfSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmAmendmentIndicator
 * MandateRelatedInformation10.mmAmendmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmAmendmentInformationDetails
 * MandateRelatedInformation10.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmElectronicSignature
 * MandateRelatedInformation10.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmFirstCollectionDate
 * MandateRelatedInformation10.mmFirstCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmFinalCollectionDate
 * MandateRelatedInformation10.mmFinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmFrequency
 * MandateRelatedInformation10.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10#mmReason
 * MandateRelatedInformation10.mmReason}</li>
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
 * "MandateRelatedInformation10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details related to a direct debit mandate signed between the creditor and the debtor."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAmendmentIndicatorTrueRule#forMandateRelatedInformation10
 * ConstraintAmendmentIndicatorTrueRule.forMandateRelatedInformation10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAmendmentIndicatorFalseRule#forMandateRelatedInformation10
 * ConstraintAmendmentIndicatorFalseRule.forMandateRelatedInformation10}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MandateRelatedInformation11
 * MandateRelatedInformation11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8
 * MandateRelatedInformation8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateRelatedInformation10", propOrder = {"mandateIdentification", "dateOfSignature", "amendmentIndicator", "amendmentInformationDetails", "electronicSignature", "firstCollectionDate", "finalCollectionDate", "frequency",
		"reason"})
public class MandateRelatedInformation10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MndtId")
	protected Max35Text mandateIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateIdentification
	 * Mandate.mmMandateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10
	 * MandateRelatedInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the creditor, to unambiguously identify the mandate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmMandateIdentification
	 * MandateRelatedInformation11.mmMandateIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmMandateIdentification
	 * MandateRelatedInformation8.mmMandateIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateRelatedInformation10, Optional<Max35Text>> mmMandateIdentification = new MMMessageAttribute<MandateRelatedInformation10, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmMandateIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmObject();
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the mandate.";
			nextVersions_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmMandateIdentification);
			previousVersion_lazy = () -> MandateRelatedInformation8.mmMandateIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MandateRelatedInformation10 obj) {
			return obj.getMandateIdentification();
		}

		@Override
		public void setValue(MandateRelatedInformation10 obj, Optional<Max35Text> value) {
			obj.setMandateIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DtOfSgntr")
	protected ISODate dateOfSignature;
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
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
	 * Agreement.mmDateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10
	 * MandateRelatedInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtOfSgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the direct debit mandate has been signed by the debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmDateOfSignature
	 * MandateRelatedInformation11.mmDateOfSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmDateOfSignature
	 * MandateRelatedInformation8.mmDateOfSignature}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateRelatedInformation10, Optional<ISODate>> mmDateOfSignature = new MMMessageAttribute<MandateRelatedInformation10, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDateSigned;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmObject();
			isDerived = false;
			xmlTag = "DtOfSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfSignature";
			definition = "Date on which the direct debit mandate has been signed by the debtor.";
			nextVersions_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmDateOfSignature);
			previousVersion_lazy = () -> MandateRelatedInformation8.mmDateOfSignature;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MandateRelatedInformation10 obj) {
			return obj.getDateOfSignature();
		}

		@Override
		public void setValue(MandateRelatedInformation10 obj, Optional<ISODate> value) {
			obj.setDateOfSignature(value.orElse(null));
		}
	};
	@XmlElement(name = "AmdmntInd")
	protected TrueFalseIndicator amendmentIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmAmendment
	 * Mandate.mmAmendment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10
	 * MandateRelatedInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator notifying whether the underlying mandate is amended or not."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmAmendmentIndicator
	 * MandateRelatedInformation11.mmAmendmentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmAmendmentIndicator
	 * MandateRelatedInformation8.mmAmendmentIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateRelatedInformation10, Optional<TrueFalseIndicator>> mmAmendmentIndicator = new MMMessageAttribute<MandateRelatedInformation10, Optional<TrueFalseIndicator>>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmAmendment;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicator";
			definition = "Indicator notifying whether the underlying mandate is amended or not.";
			nextVersions_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmAmendmentIndicator);
			previousVersion_lazy = () -> MandateRelatedInformation8.mmAmendmentIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(MandateRelatedInformation10 obj) {
			return obj.getAmendmentIndicator();
		}

		@Override
		public void setValue(MandateRelatedInformation10 obj, Optional<TrueFalseIndicator> value) {
			obj.setAmendmentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AmdmntInfDtls")
	protected AmendmentInformationDetails10 amendmentInformationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails10
	 * AmendmentInformationDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10
	 * MandateRelatedInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInfDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentInformationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of mandate elements that have been modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmAmendmentInformationDetails
	 * MandateRelatedInformation11.mmAmendmentInformationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmAmendmentInformationDetails
	 * MandateRelatedInformation8.mmAmendmentInformationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateRelatedInformation10, Optional<AmendmentInformationDetails10>> mmAmendmentInformationDetails = new MMMessageAssociationEnd<MandateRelatedInformation10, Optional<AmendmentInformationDetails10>>() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentInformationDetails";
			definition = "List of mandate elements that have been modified.";
			nextVersions_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmAmendmentInformationDetails);
			previousVersion_lazy = () -> MandateRelatedInformation8.mmAmendmentInformationDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmendmentInformationDetails10.mmObject();
		}

		@Override
		public Optional<AmendmentInformationDetails10> getValue(MandateRelatedInformation10 obj) {
			return obj.getAmendmentInformationDetails();
		}

		@Override
		public void setValue(MandateRelatedInformation10 obj, Optional<AmendmentInformationDetails10> value) {
			obj.setAmendmentInformationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctrncSgntr")
	protected Max1025Text electronicSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10
	 * MandateRelatedInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncSgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional security provisions, such as a digital signature, as provided by the debtor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmElectronicSignature
	 * MandateRelatedInformation11.mmElectronicSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmElectronicSignature
	 * MandateRelatedInformation8.mmElectronicSignature}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateRelatedInformation10, Optional<Max1025Text>> mmElectronicSignature = new MMMessageAttribute<MandateRelatedInformation10, Optional<Max1025Text>>() {
		{
			businessComponentTrace_lazy = () -> ElectronicSignature.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSignature";
			definition = "Additional security provisions, such as a digital signature, as provided by the debtor.";
			nextVersions_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmElectronicSignature);
			previousVersion_lazy = () -> MandateRelatedInformation8.mmElectronicSignature;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}

		@Override
		public Optional<Max1025Text> getValue(MandateRelatedInformation10 obj) {
			return obj.getElectronicSignature();
		}

		@Override
		public void setValue(MandateRelatedInformation10 obj, Optional<Max1025Text> value) {
			obj.setElectronicSignature(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10
	 * MandateRelatedInformation10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFirstCollectionDate
	 * MandateRelatedInformation11.mmFirstCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmFirstCollectionDate
	 * MandateRelatedInformation8.mmFirstCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateRelatedInformation10, Optional<ISODate>> mmFirstCollectionDate = new MMMessageAttribute<MandateRelatedInformation10, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFirstCollectionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmObject();
			isDerived = false;
			xmlTag = "FrstColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			nextVersions_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmFirstCollectionDate);
			previousVersion_lazy = () -> MandateRelatedInformation8.mmFirstCollectionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MandateRelatedInformation10 obj) {
			return obj.getFirstCollectionDate();
		}

		@Override
		public void setValue(MandateRelatedInformation10 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10
	 * MandateRelatedInformation10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFinalCollectionDate
	 * MandateRelatedInformation11.mmFinalCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmFinalCollectionDate
	 * MandateRelatedInformation8.mmFinalCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateRelatedInformation10, Optional<ISODate>> mmFinalCollectionDate = new MMMessageAttribute<MandateRelatedInformation10, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFinalCollectionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmObject();
			isDerived = false;
			xmlTag = "FnlColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			nextVersions_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmFinalCollectionDate);
			previousVersion_lazy = () -> MandateRelatedInformation8.mmFinalCollectionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MandateRelatedInformation10 obj) {
			return obj.getFinalCollectionDate();
		}

		@Override
		public void setValue(MandateRelatedInformation10 obj, Optional<ISODate> value) {
			obj.setFinalCollectionDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10
	 * MandateRelatedInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regularity with which direct debit instructions are to be created and processed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmFrequency
	 * MandateRelatedInformation11.mmFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation8#mmFrequency
	 * MandateRelatedInformation8.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateRelatedInformation10, Optional<Frequency21Choice>> mmFrequency = new MMMessageAttribute<MandateRelatedInformation10, Optional<Frequency21Choice>>() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Regularity with which direct debit instructions are to be created and processed.";
			nextVersions_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmFrequency);
			previousVersion_lazy = () -> MandateRelatedInformation8.mmFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Frequency21Choice.mmObject();
		}

		@Override
		public Optional<Frequency21Choice> getValue(MandateRelatedInformation10 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(MandateRelatedInformation10 obj, Optional<Frequency21Choice> value) {
			obj.setFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "Rsn")
	protected MandateSetupReason1Choice reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MandateSetupReason1Choice
	 * MandateSetupReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDescription
	 * Agreement.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation10
	 * MandateRelatedInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the direct debit mandate to allow the user to distinguish between different mandates for the same creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#mmReason
	 * MandateRelatedInformation11.mmReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateRelatedInformation10, Optional<MandateSetupReason1Choice>> mmReason = new MMMessageAssociationEnd<MandateRelatedInformation10, Optional<MandateSetupReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateRelatedInformation10.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the direct debit mandate to allow the user to distinguish between different mandates for the same creditor.";
			nextVersions_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmReason);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateSetupReason1Choice.mmObject();
		}

		@Override
		public Optional<MandateSetupReason1Choice> getValue(MandateRelatedInformation10 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(MandateRelatedInformation10 obj, Optional<MandateSetupReason1Choice> value) {
			obj.setReason(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateRelatedInformation10.mmMandateIdentification, com.tools20022.repository.msg.MandateRelatedInformation10.mmDateOfSignature,
						com.tools20022.repository.msg.MandateRelatedInformation10.mmAmendmentIndicator, com.tools20022.repository.msg.MandateRelatedInformation10.mmAmendmentInformationDetails,
						com.tools20022.repository.msg.MandateRelatedInformation10.mmElectronicSignature, com.tools20022.repository.msg.MandateRelatedInformation10.mmFirstCollectionDate,
						com.tools20022.repository.msg.MandateRelatedInformation10.mmFinalCollectionDate, com.tools20022.repository.msg.MandateRelatedInformation10.mmFrequency,
						com.tools20022.repository.msg.MandateRelatedInformation10.mmReason);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAmendmentIndicatorTrueRule.forMandateRelatedInformation10,
						com.tools20022.repository.constraints.ConstraintAmendmentIndicatorFalseRule.forMandateRelatedInformation10);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateRelatedInformation10";
				definition = "Provides further details related to a direct debit mandate signed between the creditor and the debtor.";
				nextVersions_lazy = () -> Arrays.asList(MandateRelatedInformation11.mmObject());
				previousVersion_lazy = () -> MandateRelatedInformation8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMandateIdentification() {
		return mandateIdentification == null ? Optional.empty() : Optional.of(mandateIdentification);
	}

	public MandateRelatedInformation10 setMandateIdentification(Max35Text mandateIdentification) {
		this.mandateIdentification = mandateIdentification;
		return this;
	}

	public Optional<ISODate> getDateOfSignature() {
		return dateOfSignature == null ? Optional.empty() : Optional.of(dateOfSignature);
	}

	public MandateRelatedInformation10 setDateOfSignature(ISODate dateOfSignature) {
		this.dateOfSignature = dateOfSignature;
		return this;
	}

	public Optional<TrueFalseIndicator> getAmendmentIndicator() {
		return amendmentIndicator == null ? Optional.empty() : Optional.of(amendmentIndicator);
	}

	public MandateRelatedInformation10 setAmendmentIndicator(TrueFalseIndicator amendmentIndicator) {
		this.amendmentIndicator = amendmentIndicator;
		return this;
	}

	public Optional<AmendmentInformationDetails10> getAmendmentInformationDetails() {
		return amendmentInformationDetails == null ? Optional.empty() : Optional.of(amendmentInformationDetails);
	}

	public MandateRelatedInformation10 setAmendmentInformationDetails(AmendmentInformationDetails10 amendmentInformationDetails) {
		this.amendmentInformationDetails = amendmentInformationDetails;
		return this;
	}

	public Optional<Max1025Text> getElectronicSignature() {
		return electronicSignature == null ? Optional.empty() : Optional.of(electronicSignature);
	}

	public MandateRelatedInformation10 setElectronicSignature(Max1025Text electronicSignature) {
		this.electronicSignature = electronicSignature;
		return this;
	}

	public Optional<ISODate> getFirstCollectionDate() {
		return firstCollectionDate == null ? Optional.empty() : Optional.of(firstCollectionDate);
	}

	public MandateRelatedInformation10 setFirstCollectionDate(ISODate firstCollectionDate) {
		this.firstCollectionDate = firstCollectionDate;
		return this;
	}

	public Optional<ISODate> getFinalCollectionDate() {
		return finalCollectionDate == null ? Optional.empty() : Optional.of(finalCollectionDate);
	}

	public MandateRelatedInformation10 setFinalCollectionDate(ISODate finalCollectionDate) {
		this.finalCollectionDate = finalCollectionDate;
		return this;
	}

	public Optional<Frequency21Choice> getFrequency() {
		return frequency == null ? Optional.empty() : Optional.of(frequency);
	}

	public MandateRelatedInformation10 setFrequency(Frequency21Choice frequency) {
		this.frequency = frequency;
		return this;
	}

	public Optional<MandateSetupReason1Choice> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public MandateRelatedInformation10 setReason(MandateSetupReason1Choice reason) {
		this.reason = reason;
		return this;
	}
}