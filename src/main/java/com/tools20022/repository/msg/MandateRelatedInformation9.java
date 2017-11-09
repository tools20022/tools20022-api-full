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
import com.tools20022.repository.codeset.Frequency6Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.ElectronicSignature;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmMandateIdentification
 * MandateRelatedInformation9.mmMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmDateOfSignature
 * MandateRelatedInformation9.mmDateOfSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmAmendmentIndicator
 * MandateRelatedInformation9.mmAmendmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmAmendmentInformationDetails
 * MandateRelatedInformation9.mmAmendmentInformationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmElectronicSignature
 * MandateRelatedInformation9.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmFirstCollectionDate
 * MandateRelatedInformation9.mmFirstCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmFinalCollectionDate
 * MandateRelatedInformation9.mmFinalCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9#mmFrequency
 * MandateRelatedInformation9.mmFrequency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
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
 * "MandateRelatedInformation9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides further details related to a direct debit mandate signed between the creditor and the debtor."
 * </li>
 * </ul>
 */
public class MandateRelatedInformation9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text mandateIdentification;
	/**
	 * Unique identification, as assigned by the creditor, to unambiguously
	 * identify the mandate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9
	 * MandateRelatedInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the creditor, to unambiguously identify the mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMandateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Mandate.mmMandateIdentification;
			componentContext_lazy = () -> MandateRelatedInformation9.mmObject();
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate dateOfSignature;
	/**
	 * Date on which the direct debit mandate has been signed by the debtor.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9
	 * MandateRelatedInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtOfSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the direct debit mandate has been signed by the debtor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateOfSignature = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDateSigned;
			componentContext_lazy = () -> MandateRelatedInformation9.mmObject();
			isDerived = false;
			xmlTag = "DtOfSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfSignature";
			definition = "Date on which the direct debit mandate has been signed by the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected TrueFalseIndicator amendmentIndicator;
	/**
	 * Indicator notifying whether the underlying mandate is amended or not.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9
	 * MandateRelatedInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator notifying whether the underlying mandate is amended or not."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmendmentIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Mandate.mmAmendment;
			componentContext_lazy = () -> MandateRelatedInformation9.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicator";
			definition = "Indicator notifying whether the underlying mandate is amended or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected AmendmentInformationDetails9 amendmentInformationDetails;
	/**
	 * List of mandate elements that have been modified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentInformationDetails9
	 * AmendmentInformationDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9
	 * MandateRelatedInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentInformationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of mandate elements that have been modified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmendmentInformationDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> MandateRelatedInformation9.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentInformationDetails";
			definition = "List of mandate elements that have been modified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmendmentInformationDetails9.mmObject();
		}
	};
	protected Max1025Text electronicSignature;
	/**
	 * Additional security provisions, such as a digital signature, as provided
	 * by the debtor.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9
	 * MandateRelatedInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional security provisions, such as a digital signature, as provided by the debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicSignature = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ElectronicSignature.mmObject();
			componentContext_lazy = () -> MandateRelatedInformation9.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSignature";
			definition = "Additional security provisions, such as a digital signature, as provided by the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}
	};
	protected ISODate firstCollectionDate;
	/**
	 * Date of the first collection of a direct debit as per the mandate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9
	 * MandateRelatedInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the first collection of a direct debit as per the mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFirstCollectionDate;
			componentContext_lazy = () -> MandateRelatedInformation9.mmObject();
			isDerived = false;
			xmlTag = "FrstColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstCollectionDate";
			definition = "Date of the first collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate finalCollectionDate;
	/**
	 * Date of the final collection of a direct debit as per the mandate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9
	 * MandateRelatedInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the final collection of a direct debit as per the mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFinalCollectionDate;
			componentContext_lazy = () -> MandateRelatedInformation9.mmObject();
			isDerived = false;
			xmlTag = "FnlColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalCollectionDate";
			definition = "Date of the final collection of a direct debit as per the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Frequency6Code frequency;
	/**
	 * Regularity with which direct debit instructions are to be created and
	 * processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency6Code
	 * Frequency6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate#mmFrequency
	 * DirectDebitMandate.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation9
	 * MandateRelatedInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regularity with which direct debit instructions are to be created and processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DirectDebitMandate.mmFrequency;
			componentContext_lazy = () -> MandateRelatedInformation9.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Regularity with which direct debit instructions are to be created and processed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency6Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MandateRelatedInformation9.mmMandateIdentification, MandateRelatedInformation9.mmDateOfSignature, MandateRelatedInformation9.mmAmendmentIndicator,
						MandateRelatedInformation9.mmAmendmentInformationDetails, MandateRelatedInformation9.mmElectronicSignature, MandateRelatedInformation9.mmFirstCollectionDate, MandateRelatedInformation9.mmFinalCollectionDate,
						MandateRelatedInformation9.mmFrequency);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateRelatedInformation9";
				definition = "Provides further details related to a direct debit mandate signed between the creditor and the debtor.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMandateIdentification() {
		return mandateIdentification;
	}

	public void setMandateIdentification(Max35Text mandateIdentification) {
		this.mandateIdentification = mandateIdentification;
	}

	public ISODate getDateOfSignature() {
		return dateOfSignature;
	}

	public void setDateOfSignature(ISODate dateOfSignature) {
		this.dateOfSignature = dateOfSignature;
	}

	public TrueFalseIndicator getAmendmentIndicator() {
		return amendmentIndicator;
	}

	public void setAmendmentIndicator(TrueFalseIndicator amendmentIndicator) {
		this.amendmentIndicator = amendmentIndicator;
	}

	public AmendmentInformationDetails9 getAmendmentInformationDetails() {
		return amendmentInformationDetails;
	}

	public void setAmendmentInformationDetails(com.tools20022.repository.msg.AmendmentInformationDetails9 amendmentInformationDetails) {
		this.amendmentInformationDetails = amendmentInformationDetails;
	}

	public Max1025Text getElectronicSignature() {
		return electronicSignature;
	}

	public void setElectronicSignature(Max1025Text electronicSignature) {
		this.electronicSignature = electronicSignature;
	}

	public ISODate getFirstCollectionDate() {
		return firstCollectionDate;
	}

	public void setFirstCollectionDate(ISODate firstCollectionDate) {
		this.firstCollectionDate = firstCollectionDate;
	}

	public ISODate getFinalCollectionDate() {
		return finalCollectionDate;
	}

	public void setFinalCollectionDate(ISODate finalCollectionDate) {
		this.finalCollectionDate = finalCollectionDate;
	}

	public Frequency6Code getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency6Code frequency) {
		this.frequency = frequency;
	}
}