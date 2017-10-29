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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Physical representation of a security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesCertificate"
 * src="doc-files/SecuritiesCertificate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#Number
 * SecuritiesCertificate.Number}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#BasicRegistration
 * SecuritiesCertificate.BasicRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#RelatedDelivery
 * SecuritiesCertificate.RelatedDelivery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForSecuritiesCertificate
 * GenericIdentification.IdentificationForSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#IssuedCertificateNumber
 * PhysicalDelivery.IssuedCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#SecuritiesCertificate
 * BasicSecuritiesRegistration.SecuritiesCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCertificate1
 * SecuritiesCertificate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCertificate2
 * SecuritiesCertificate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCertificate3
 * SecuritiesCertificate3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCertificate4
 * SecuritiesCertificate4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesCertificate5
 * SecuritiesCertificate5}</li>
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
 * "SecuritiesCertificate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Physical representation of a security."</li>
 * </ul>
 */
public class SecuritiesCertificate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifier of a certificate assigned by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#IdentificationForSecuritiesCertificate
	 * GenericIdentification.IdentificationForSecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit1#CertificateNumber
	 * Unit1.CertificateNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit3#CertificateNumber
	 * Unit3.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#CertificateNumber
	 * RegistrationParameters1.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters2#CertificateNumber
	 * RegistrationParameters2.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#CertificateNumber
	 * FinancialInstrumentAttributes1.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate3#Number
	 * SecuritiesCertificate3.Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#CertificateNumber
	 * FinancialInstrumentAttributes31.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#CertificateNumber
	 * FinancialInstrumentAttributes44.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity5#CertificateNumber
	 * Quantity5.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity6#CertificateNumber
	 * Quantity6.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity7#CertificateNumber
	 * Quantity7.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity8#CertificateNumber
	 * Quantity8.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#CertificateNumber
	 * CommonFinancialInstrumentAttributes1.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#CertificateNumber
	 * RegistrationParameters4.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity11#CertificateNumber
	 * Quantity11.CertificateNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#CertificateNumber
	 * Unit6.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters5#CertificateNumber
	 * RegistrationParameters5.CertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity12#CertificateNumber
	 * Quantity12.CertificateNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a certificate assigned by the issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Number = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Unit1.CertificateNumber, com.tools20022.repository.msg.Unit3.CertificateNumber, com.tools20022.repository.msg.RegistrationParameters1.CertificateNumber,
					com.tools20022.repository.msg.RegistrationParameters2.CertificateNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes1.CertificateNumber, com.tools20022.repository.msg.SecuritiesCertificate3.Number,
					com.tools20022.repository.msg.FinancialInstrumentAttributes31.CertificateNumber, com.tools20022.repository.msg.FinancialInstrumentAttributes44.CertificateNumber,
					com.tools20022.repository.msg.Quantity5.CertificateNumber, com.tools20022.repository.msg.Quantity6.CertificateNumber, com.tools20022.repository.msg.Quantity7.CertificateNumber,
					com.tools20022.repository.msg.Quantity8.CertificateNumber, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.CertificateNumber, com.tools20022.repository.msg.RegistrationParameters4.CertificateNumber,
					com.tools20022.repository.msg.Quantity11.CertificateNumber, com.tools20022.repository.msg.Unit6.CertificateNumber, com.tools20022.repository.msg.RegistrationParameters5.CertificateNumber,
					com.tools20022.repository.msg.Quantity12.CertificateNumber);
			elementContext_lazy = () -> SecuritiesCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Identifier of a certificate assigned by the issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.IdentificationForSecuritiesCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Registration process which requires a securities certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#SecuritiesCertificate
	 * BasicSecuritiesRegistration.SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasicRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration process which requires a securities certificate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BasicRegistration = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasicRegistration";
			definition = "Registration process which requires a securities certificate.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> BasicSecuritiesRegistration.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BasicSecuritiesRegistration.SecuritiesCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Delivery parameters which specify the certificate parameters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#IssuedCertificateNumber
	 * PhysicalDelivery.IssuedCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery parameters which specify the certificate parameters."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedDelivery";
			definition = "Delivery parameters which specify the certificate parameters.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PhysicalDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PhysicalDelivery.IssuedCertificateNumber;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesCertificate";
				definition = "Physical representation of a security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.IdentificationForSecuritiesCertificate, com.tools20022.repository.entity.PhysicalDelivery.IssuedCertificateNumber,
						com.tools20022.repository.entity.BasicSecuritiesRegistration.SecuritiesCertificate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesCertificate.Number, com.tools20022.repository.entity.SecuritiesCertificate.BasicRegistration,
						com.tools20022.repository.entity.SecuritiesCertificate.RelatedDelivery);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesCertificate1.mmObject(), SecuritiesCertificate2.mmObject(), SecuritiesCertificate3.mmObject(), SecuritiesCertificate4.mmObject(), SecuritiesCertificate5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}