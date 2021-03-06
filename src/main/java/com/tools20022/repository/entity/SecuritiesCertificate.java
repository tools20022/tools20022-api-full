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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.BasicSecuritiesRegistration;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.PhysicalDelivery;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
 * SecuritiesCertificate.mmNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmBasicRegistration
 * SecuritiesCertificate.mmBasicRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmRelatedDelivery
 * SecuritiesCertificate.mmRelatedDelivery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForSecuritiesCertificate
 * GenericIdentification.mmIdentificationForSecuritiesCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmIssuedCertificateNumber
 * PhysicalDelivery.mmIssuedCertificateNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecuritiesCertificate
 * BasicSecuritiesRegistration.mmSecuritiesCertificate}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesCertificate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Physical representation of a security."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecuritiesCertificate {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification number;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForSecuritiesCertificate
	 * GenericIdentification.mmIdentificationForSecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit1#mmCertificateNumber
	 * Unit1.mmCertificateNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit3#mmCertificateNumber
	 * Unit3.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters1#mmCertificateNumber
	 * RegistrationParameters1.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters2#mmCertificateNumber
	 * RegistrationParameters2.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmCertificateNumber
	 * FinancialInstrumentAttributes1.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate3#mmNumber
	 * SecuritiesCertificate3.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmCertificateNumber
	 * FinancialInstrumentAttributes31.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmCertificateNumber
	 * FinancialInstrumentAttributes44.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity5#mmCertificateNumber
	 * Quantity5.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity6#mmCertificateNumber
	 * Quantity6.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity7#mmCertificateNumber
	 * Quantity7.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity8#mmCertificateNumber
	 * Quantity8.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmCertificateNumber
	 * CommonFinancialInstrumentAttributes1.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters4#mmCertificateNumber
	 * RegistrationParameters4.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity11#mmCertificateNumber
	 * Quantity11.mmCertificateNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#mmCertificateNumber
	 * Unit6.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters5#mmCertificateNumber
	 * RegistrationParameters5.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity12#mmCertificateNumber
	 * Quantity12.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmCertificateNumber
	 * CommonFinancialInstrumentAttributes4.mmCertificateNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit8#mmCertificateNumber
	 * Unit8.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity14#mmCertificateNumber
	 * Quantity14.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters6#mmCertificateNumber
	 * RegistrationParameters6.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity15#mmCertificateNumber
	 * Quantity15.mmCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters7#mmCertificateNumber
	 * RegistrationParameters7.mmCertificateNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Number"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of a certificate assigned by the issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13B::CERT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesCertificate, GenericIdentification> mmNumber = new MMBusinessAssociationEnd<SecuritiesCertificate, GenericIdentification>() {
		{
			derivation_lazy = () -> Arrays.asList(Unit1.mmCertificateNumber, Unit3.mmCertificateNumber, RegistrationParameters1.mmCertificateNumber, RegistrationParameters2.mmCertificateNumber,
					FinancialInstrumentAttributes1.mmCertificateNumber, SecuritiesCertificate3.mmNumber, FinancialInstrumentAttributes31.mmCertificateNumber, FinancialInstrumentAttributes44.mmCertificateNumber,
					Quantity5.mmCertificateNumber, Quantity6.mmCertificateNumber, Quantity7.mmCertificateNumber, Quantity8.mmCertificateNumber, CommonFinancialInstrumentAttributes1.mmCertificateNumber,
					RegistrationParameters4.mmCertificateNumber, Quantity11.mmCertificateNumber, Unit6.mmCertificateNumber, RegistrationParameters5.mmCertificateNumber, Quantity12.mmCertificateNumber,
					CommonFinancialInstrumentAttributes4.mmCertificateNumber, Unit8.mmCertificateNumber, Quantity14.mmCertificateNumber, RegistrationParameters6.mmCertificateNumber, Quantity15.mmCertificateNumber,
					RegistrationParameters7.mmCertificateNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13B::CERT"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Number";
			definition = "Identifier of a certificate assigned by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmIdentificationForSecuritiesCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(SecuritiesCertificate obj) {
			return obj.getNumber();
		}

		@Override
		public void setValue(SecuritiesCertificate obj, GenericIdentification value) {
			obj.setNumber(value);
		}
	};
	protected BasicSecuritiesRegistration basicRegistration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration
	 * BasicSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BasicSecuritiesRegistration#mmSecuritiesCertificate
	 * BasicSecuritiesRegistration.mmSecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasicRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration process which requires a securities certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesCertificate, Optional<BasicSecuritiesRegistration>> mmBasicRegistration = new MMBusinessAssociationEnd<SecuritiesCertificate, Optional<BasicSecuritiesRegistration>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BasicRegistration";
			definition = "Registration process which requires a securities certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> BasicSecuritiesRegistration.mmSecuritiesCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> BasicSecuritiesRegistration.mmObject();
		}

		@Override
		public Optional<BasicSecuritiesRegistration> getValue(SecuritiesCertificate obj) {
			return obj.getBasicRegistration();
		}

		@Override
		public void setValue(SecuritiesCertificate obj, Optional<BasicSecuritiesRegistration> value) {
			obj.setBasicRegistration(value.orElse(null));
		}
	};
	protected PhysicalDelivery relatedDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmIssuedCertificateNumber
	 * PhysicalDelivery.mmIssuedCertificateNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Delivery parameters which specify the certificate parameters."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesCertificate, Optional<PhysicalDelivery>> mmRelatedDelivery = new MMBusinessAssociationEnd<SecuritiesCertificate, Optional<PhysicalDelivery>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDelivery";
			definition = "Delivery parameters which specify the certificate parameters.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> PhysicalDelivery.mmIssuedCertificateNumber;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PhysicalDelivery.mmObject();
		}

		@Override
		public Optional<PhysicalDelivery> getValue(SecuritiesCertificate obj) {
			return obj.getRelatedDelivery();
		}

		@Override
		public void setValue(SecuritiesCertificate obj, Optional<PhysicalDelivery> value) {
			obj.setRelatedDelivery(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesCertificate";
				definition = "Physical representation of a security.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmIdentificationForSecuritiesCertificate, PhysicalDelivery.mmIssuedCertificateNumber, BasicSecuritiesRegistration.mmSecuritiesCertificate);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesCertificate.mmNumber, com.tools20022.repository.entity.SecuritiesCertificate.mmBasicRegistration,
						com.tools20022.repository.entity.SecuritiesCertificate.mmRelatedDelivery);
				derivationComponent_lazy = () -> Arrays.asList(SecuritiesCertificate1.mmObject(), SecuritiesCertificate2.mmObject(), SecuritiesCertificate3.mmObject(), SecuritiesCertificate4.mmObject(), SecuritiesCertificate5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesCertificate.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification getNumber() {
		return number;
	}

	public SecuritiesCertificate setNumber(GenericIdentification number) {
		this.number = Objects.requireNonNull(number);
		return this;
	}

	public Optional<BasicSecuritiesRegistration> getBasicRegistration() {
		return basicRegistration == null ? Optional.empty() : Optional.of(basicRegistration);
	}

	public SecuritiesCertificate setBasicRegistration(BasicSecuritiesRegistration basicRegistration) {
		this.basicRegistration = basicRegistration;
		return this;
	}

	public Optional<PhysicalDelivery> getRelatedDelivery() {
		return relatedDelivery == null ? Optional.empty() : Optional.of(relatedDelivery);
	}

	public SecuritiesCertificate setRelatedDelivery(PhysicalDelivery relatedDelivery) {
		this.relatedDelivery = relatedDelivery;
		return this;
	}
}