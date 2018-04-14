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
import com.tools20022.repository.codeset.TradeCertificateTypeCode;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.ProductDelivery;
import com.tools20022.repository.entity.TradeCertificatePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Formal document used to record a fact and used as proof of the fact, in the
 * context of a commercial trade transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradeCertificate" src="doc-files/TradeCertificate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmCertificateType
 * TradeCertificate.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmInspectionDate
 * TradeCertificate.mmInspectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmTradeCertificatePartyRole
 * TradeCertificate.mmTradeCertificatePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmProductDelivery
 * TradeCertificate.mmProductDelivery}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradeCertificate
 * DateTimePeriod.mmTradeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmTradeCertificate
 * ProductDelivery.mmTradeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeCertificatePartyRole#mmTradeCertificate
 * TradeCertificatePartyRole.mmTradeCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmDataSetIdentification
 * CertificateDataSet1.mmDataSetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmCertifiedCharacteristics
 * CertificateDataSet1.mmCertifiedCharacteristics}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RequiredSubmission4
 * RequiredSubmission4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequiredSubmission5
 * RequiredSubmission5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CertificateDataSet1
 * CertificateDataSet1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1
 * OtherCertificateDataSet1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CertificateDataSet2
 * CertificateDataSet2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2
 * OtherCertificateDataSet2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequiredSubmission6
 * RequiredSubmission6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionCertificate1
 * TransactionCertificate1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeCertificate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class TradeCertificate extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TradeCertificateTypeCode certificateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeCertificateTypeCode
	 * TradeCertificateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission4#mmCertificateType
	 * RequiredSubmission4.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission5#mmCertificateType
	 * RequiredSubmission5.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmCertificateType
	 * CertificateDataSet1.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1#mmCertificateType
	 * OtherCertificateDataSet1.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmCertificateType
	 * CertificateDataSet2.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2#mmCertificateType
	 * OtherCertificateDataSet2.mmCertificateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RequiredSubmission6#mmCertificateType
	 * RequiredSubmission6.mmCertificateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate
	 * TradeCertificate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of the certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TradeCertificate, TradeCertificateTypeCode> mmCertificateType = new MMBusinessAttribute<TradeCertificate, TradeCertificateTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(RequiredSubmission4.mmCertificateType, RequiredSubmission5.mmCertificateType, CertificateDataSet1.mmCertificateType, OtherCertificateDataSet1.mmCertificateType,
					CertificateDataSet2.mmCertificateType, OtherCertificateDataSet2.mmCertificateType, RequiredSubmission6.mmCertificateType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateType";
			definition = "Specifies the type of the certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeCertificateTypeCode.mmObject();
		}

		@Override
		public TradeCertificateTypeCode getValue(TradeCertificate obj) {
			return obj.getCertificateType();
		}

		@Override
		public void setValue(TradeCertificate obj, TradeCertificateTypeCode value) {
			obj.setCertificateType(value);
		}
	};
	protected DateTimePeriod inspectionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmTradeCertificate
	 * DateTimePeriod.mmTradeCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmInspectionDate
	 * CertificateDataSet1.mmInspectionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmInspectionDate
	 * CertificateDataSet2.mmInspectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate
	 * TradeCertificate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InspectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date(s) at which inspection of the goods took place."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradeCertificate, DateTimePeriod> mmInspectionDate = new MMBusinessAssociationEnd<TradeCertificate, DateTimePeriod>() {
		{
			derivation_lazy = () -> Arrays.asList(CertificateDataSet1.mmInspectionDate, CertificateDataSet2.mmInspectionDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InspectionDate";
			definition = "Date(s) at which inspection of the goods took place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmTradeCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(TradeCertificate obj) {
			return obj.getInspectionDate();
		}

		@Override
		public void setValue(TradeCertificate obj, DateTimePeriod value) {
			obj.setInspectionDate(value);
		}
	};
	protected List<com.tools20022.repository.entity.TradeCertificatePartyRole> tradeCertificatePartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificatePartyRole
	 * TradeCertificatePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificatePartyRole#mmTradeCertificate
	 * TradeCertificatePartyRole.mmTradeCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate
	 * TradeCertificate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeCertificatePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of issuing a trade certificate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradeCertificate, List<TradeCertificatePartyRole>> mmTradeCertificatePartyRole = new MMBusinessAssociationEnd<TradeCertificate, List<TradeCertificatePartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeCertificatePartyRole";
			definition = "Role played by a party in the context of issuing a trade certificate.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeCertificatePartyRole.mmTradeCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradeCertificatePartyRole.mmObject();
		}

		@Override
		public List<TradeCertificatePartyRole> getValue(TradeCertificate obj) {
			return obj.getTradeCertificatePartyRole();
		}

		@Override
		public void setValue(TradeCertificate obj, List<TradeCertificatePartyRole> value) {
			obj.setTradeCertificatePartyRole(value);
		}
	};
	protected ProductDelivery productDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmTradeCertificate
	 * ProductDelivery.mmTradeCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate
	 * TradeCertificate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery parameters of a trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TradeCertificate, Optional<ProductDelivery>> mmProductDelivery = new MMBusinessAssociationEnd<TradeCertificate, Optional<ProductDelivery>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Delivery parameters of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmTradeCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}

		@Override
		public Optional<ProductDelivery> getValue(TradeCertificate obj) {
			return obj.getProductDelivery();
		}

		@Override
		public void setValue(TradeCertificate obj, Optional<ProductDelivery> value) {
			obj.setProductDelivery(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeCertificate";
				definition = "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmTradeCertificate, com.tools20022.repository.entity.ProductDelivery.mmTradeCertificate,
						com.tools20022.repository.entity.TradeCertificatePartyRole.mmTradeCertificate);
				derivationElement_lazy = () -> Arrays.asList(CertificateDataSet1.mmDataSetIdentification, CertificateDataSet1.mmCertifiedCharacteristics);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeCertificate.mmCertificateType, com.tools20022.repository.entity.TradeCertificate.mmInspectionDate,
						com.tools20022.repository.entity.TradeCertificate.mmTradeCertificatePartyRole, com.tools20022.repository.entity.TradeCertificate.mmProductDelivery);
				derivationComponent_lazy = () -> Arrays.asList(RequiredSubmission4.mmObject(), RequiredSubmission5.mmObject(), CertificateDataSet1.mmObject(), OtherCertificateDataSet1.mmObject(), CertificateDataSet2.mmObject(),
						OtherCertificateDataSet2.mmObject(), RequiredSubmission6.mmObject(), TransactionCertificate1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradeCertificate.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeCertificateTypeCode getCertificateType() {
		return certificateType;
	}

	public TradeCertificate setCertificateType(TradeCertificateTypeCode certificateType) {
		this.certificateType = Objects.requireNonNull(certificateType);
		return this;
	}

	public DateTimePeriod getInspectionDate() {
		return inspectionDate;
	}

	public TradeCertificate setInspectionDate(DateTimePeriod inspectionDate) {
		this.inspectionDate = Objects.requireNonNull(inspectionDate);
		return this;
	}

	public List<TradeCertificatePartyRole> getTradeCertificatePartyRole() {
		return tradeCertificatePartyRole == null ? tradeCertificatePartyRole = new ArrayList<>() : tradeCertificatePartyRole;
	}

	public TradeCertificate setTradeCertificatePartyRole(List<com.tools20022.repository.entity.TradeCertificatePartyRole> tradeCertificatePartyRole) {
		this.tradeCertificatePartyRole = Objects.requireNonNull(tradeCertificatePartyRole);
		return this;
	}

	public Optional<ProductDelivery> getProductDelivery() {
		return productDelivery == null ? Optional.empty() : Optional.of(productDelivery);
	}

	public TradeCertificate setProductDelivery(com.tools20022.repository.entity.ProductDelivery productDelivery) {
		this.productDelivery = productDelivery;
		return this;
	}
}