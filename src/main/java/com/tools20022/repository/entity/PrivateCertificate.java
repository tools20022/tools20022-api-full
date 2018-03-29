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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.CertificationType1Choice;
import com.tools20022.repository.codeset.CertificateTypeCode;
import com.tools20022.repository.codeset.EventFrequencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.PersonProfile;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the parameters associated with the production of a certificate to
 * identify the profile of a customer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PrivateCertificate" src="doc-files/PrivateCertificate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCertificateType
 * PrivateCertificate.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCertificationIndicator
 * PrivateCertificate.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCheckingDate
 * PrivateCertificate.mmCheckingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCheckingFrequency
 * PrivateCertificate.mmCheckingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmNextRevisionDate
 * PrivateCertificate.mmNextRevisionDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PrivateCertificate#mmPerson
 * PrivateCertificate.mmPerson}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmProfileCertification
 * PersonProfile.mmProfileCertification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmCertificateType
 * PartyProfileInformation2.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCertificateType
 * PartyProfileInformation3.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmCertificateType
 * PartyProfileInformation4.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCertificateType
 * PartyProfileInformation5.mmCertificateType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyProfileInformation1
 * PartyProfileInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CertificationType1Choice
 * CertificationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyProfileInformation2
 * PartyProfileInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyProfileInformation3
 * PartyProfileInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyProfileInformation4
 * PartyProfileInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyProfileInformation5
 * PartyProfileInformation5}</li>
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
 * "PrivateCertificate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the parameters associated with the production of a certificate to identify the profile of a customer."
 * </li>
 * </ul>
 */
public class PrivateCertificate extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CertificateTypeCode certificateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmCertificateType
	 * PartyProfileInformation1.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmExtendedCertificateType
	 * PartyProfileInformation1.mmExtendedCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationType1Choice#mmCode
	 * CertificationType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CertificationType1Choice#mmProprietary
	 * CertificationType1Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of certificate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PrivateCertificate, CertificateTypeCode> mmCertificateType = new MMBusinessAttribute<PrivateCertificate, CertificateTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyProfileInformation1.mmCertificateType, PartyProfileInformation1.mmExtendedCertificateType, CertificationType1Choice.mmCode, CertificationType1Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateType";
			definition = "Identifies the type of certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CertificateTypeCode.mmObject();
		}

		@Override
		public CertificateTypeCode getValue(PrivateCertificate obj) {
			return obj.getCertificateType();
		}

		@Override
		public void setValue(PrivateCertificate obj, CertificateTypeCode value) {
			obj.setCertificateType(value);
		}
	};
	protected YesNoIndicator certificationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmCertificationIndicator
	 * PartyProfileInformation1.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmCertificationIndicator
	 * PartyProfileInformation2.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCertificationIndicator
	 * PartyProfileInformation3.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmCertificationIndicator
	 * PartyProfileInformation4.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCertificationIndicator
	 * PartyProfileInformation5.mmCertificationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the certificate type has been obtained and verified."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PrivateCertificate, YesNoIndicator> mmCertificationIndicator = new MMBusinessAttribute<PrivateCertificate, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyProfileInformation1.mmCertificationIndicator, PartyProfileInformation2.mmCertificationIndicator, PartyProfileInformation3.mmCertificationIndicator,
					PartyProfileInformation4.mmCertificationIndicator, PartyProfileInformation5.mmCertificationIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether the certificate type has been obtained and verified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PrivateCertificate obj) {
			return obj.getCertificationIndicator();
		}

		@Override
		public void setValue(PrivateCertificate obj, YesNoIndicator value) {
			obj.setCertificationIndicator(value);
		}
	};
	protected ISODate checkingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmCheckingDate
	 * PartyProfileInformation1.mmCheckingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmCheckingDate
	 * PartyProfileInformation2.mmCheckingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCheckingDate
	 * PartyProfileInformation3.mmCheckingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmCheckingDate
	 * PartyProfileInformation4.mmCheckingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCheckingDate
	 * PartyProfileInformation5.mmCheckingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the certification check has been performed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PrivateCertificate, ISODate> mmCheckingDate = new MMBusinessAttribute<PrivateCertificate, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyProfileInformation1.mmCheckingDate, PartyProfileInformation2.mmCheckingDate, PartyProfileInformation3.mmCheckingDate, PartyProfileInformation4.mmCheckingDate,
					PartyProfileInformation5.mmCheckingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CheckingDate";
			definition = "Date at which the certification check has been performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(PrivateCertificate obj) {
			return obj.getCheckingDate();
		}

		@Override
		public void setValue(PrivateCertificate obj, ISODate value) {
			obj.setCheckingDate(value);
		}
	};
	protected EventFrequencyCode checkingFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmCheckingFrequency
	 * PartyProfileInformation1.mmCheckingFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmCheckingFrequency
	 * PartyProfileInformation2.mmCheckingFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmCheckingFrequency
	 * PartyProfileInformation3.mmCheckingFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmCheckingFrequency
	 * PartyProfileInformation4.mmCheckingFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCheckingFrequency
	 * PartyProfileInformation5.mmCheckingFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how frequently the check is performed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PrivateCertificate, EventFrequencyCode> mmCheckingFrequency = new MMBusinessAttribute<PrivateCertificate, EventFrequencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyProfileInformation1.mmCheckingFrequency, PartyProfileInformation2.mmCheckingFrequency, PartyProfileInformation3.mmCheckingFrequency, PartyProfileInformation4.mmCheckingFrequency,
					PartyProfileInformation5.mmCheckingFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CheckingFrequency";
			definition = "Specifies how frequently the check is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}

		@Override
		public EventFrequencyCode getValue(PrivateCertificate obj) {
			return obj.getCheckingFrequency();
		}

		@Override
		public void setValue(PrivateCertificate obj, EventFrequencyCode value) {
			obj.setCheckingFrequency(value);
		}
	};
	protected ISODate nextRevisionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmNextRevisionDate
	 * PartyProfileInformation1.mmNextRevisionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmNextRevisionDate
	 * PartyProfileInformation2.mmNextRevisionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmNextRevisionDate
	 * PartyProfileInformation3.mmNextRevisionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmNextRevisionDate
	 * PartyProfileInformation4.mmNextRevisionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmNextRevisionDate
	 * PartyProfileInformation5.mmNextRevisionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextRevisionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date at which the next certification check will be performed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<PrivateCertificate, ISODate> mmNextRevisionDate = new MMBusinessAttribute<PrivateCertificate, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(PartyProfileInformation1.mmNextRevisionDate, PartyProfileInformation2.mmNextRevisionDate, PartyProfileInformation3.mmNextRevisionDate, PartyProfileInformation4.mmNextRevisionDate,
					PartyProfileInformation5.mmNextRevisionDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextRevisionDate";
			definition = "Specifies the date at which the next certification check will be performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(PrivateCertificate obj) {
			return obj.getNextRevisionDate();
		}

		@Override
		public void setValue(PrivateCertificate obj, ISODate value) {
			obj.setNextRevisionDate(value);
		}
	};
	protected PersonProfile person;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmProfileCertification
	 * PersonProfile.mmProfileCertification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PersonProfile
	 * PersonProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Profile of a person for which a private certificate is described."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<PrivateCertificate, Optional<PersonProfile>> mmPerson = new MMBusinessAssociationEnd<PrivateCertificate, Optional<PersonProfile>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Profile of a person for which a private certificate is described.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PersonProfile.mmProfileCertification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PersonProfile.mmObject();
		}

		@Override
		public Optional<PersonProfile> getValue(PrivateCertificate obj) {
			return obj.getPerson();
		}

		@Override
		public void setValue(PrivateCertificate obj, Optional<PersonProfile> value) {
			obj.setPerson(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PrivateCertificate";
				definition = "Specifies the parameters associated with the production of a certificate to identify the profile of a customer.";
				associationDomain_lazy = () -> Arrays.asList(PersonProfile.mmProfileCertification);
				derivationElement_lazy = () -> Arrays.asList(PartyProfileInformation2.mmCertificateType, PartyProfileInformation3.mmCertificateType, PartyProfileInformation4.mmCertificateType, PartyProfileInformation5.mmCertificateType);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PrivateCertificate.mmCertificateType, com.tools20022.repository.entity.PrivateCertificate.mmCertificationIndicator,
						com.tools20022.repository.entity.PrivateCertificate.mmCheckingDate, com.tools20022.repository.entity.PrivateCertificate.mmCheckingFrequency, com.tools20022.repository.entity.PrivateCertificate.mmNextRevisionDate,
						com.tools20022.repository.entity.PrivateCertificate.mmPerson);
				derivationComponent_lazy = () -> Arrays.asList(PartyProfileInformation1.mmObject(), CertificationType1Choice.mmObject(), PartyProfileInformation2.mmObject(), PartyProfileInformation3.mmObject(),
						PartyProfileInformation4.mmObject(), PartyProfileInformation5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return PrivateCertificate.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CertificateTypeCode getCertificateType() {
		return certificateType;
	}

	public PrivateCertificate setCertificateType(CertificateTypeCode certificateType) {
		this.certificateType = Objects.requireNonNull(certificateType);
		return this;
	}

	public YesNoIndicator getCertificationIndicator() {
		return certificationIndicator;
	}

	public PrivateCertificate setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = Objects.requireNonNull(certificationIndicator);
		return this;
	}

	public ISODate getCheckingDate() {
		return checkingDate;
	}

	public PrivateCertificate setCheckingDate(ISODate checkingDate) {
		this.checkingDate = Objects.requireNonNull(checkingDate);
		return this;
	}

	public EventFrequencyCode getCheckingFrequency() {
		return checkingFrequency;
	}

	public PrivateCertificate setCheckingFrequency(EventFrequencyCode checkingFrequency) {
		this.checkingFrequency = Objects.requireNonNull(checkingFrequency);
		return this;
	}

	public ISODate getNextRevisionDate() {
		return nextRevisionDate;
	}

	public PrivateCertificate setNextRevisionDate(ISODate nextRevisionDate) {
		this.nextRevisionDate = Objects.requireNonNull(nextRevisionDate);
		return this;
	}

	public Optional<PersonProfile> getPerson() {
		return person == null ? Optional.empty() : Optional.of(person);
	}

	public PrivateCertificate setPerson(PersonProfile person) {
		this.person = person;
		return this;
	}
}