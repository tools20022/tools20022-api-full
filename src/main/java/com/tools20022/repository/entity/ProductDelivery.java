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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Arrangements for delivery of invoiced products and/or services.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProductDelivery" src="doc-files/ProductDelivery.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery1 TradeDelivery1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery2 TradeDelivery2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedProductDelivery
 * DateTimePeriod.mmRelatedProductDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmDelivery
 * Product.mmDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmProductDelivery
 * InsuranceCertificate.mmProductDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmProductDelivery
 * Transport.mmProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmProductDelivery
 * CommercialTradeSettlement.mmProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmProductDelivery
 * TradeCertificate.mmProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#mmProductDeliveryOffset
 * ProductDeliveryObligation.mmProductDeliveryOffset}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmDeliveryPeriod
 * ProductDelivery.mmDeliveryPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
 * ProductDelivery.mmRouting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmTradeSettlement
 * ProductDelivery.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmObligation
 * ProductDelivery.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmTradeCertificate
 * ProductDelivery.mmTradeCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmInsuranceCertificate
 * ProductDelivery.mmInsuranceCertificate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#mmProduct
 * ProductDelivery.mmProduct}</li>
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
 * "ProductDelivery"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Arrangements for delivery of invoiced products and/or services."</li>
 * </ul>
 */
public class ProductDelivery extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DateTimePeriod deliveryPeriod;
	/**
	 * Actual delivery period of the products and/or services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedProductDelivery
	 * DateTimePeriod.mmRelatedProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery1#mmDeliveryPeriod
	 * TradeDelivery1.mmDeliveryPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmDeliveryPeriod
	 * TradeDelivery2.mmDeliveryPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual delivery period of the products and/or services."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeliveryPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradeDelivery1.mmDeliveryPeriod, TradeDelivery2.mmDeliveryPeriod);
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryPeriod";
			definition = "Actual delivery period of the products and/or services.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedProductDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Transport> routing;
	/**
	 * Information related to the conveyance of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmProductDelivery
	 * Transport.mmProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery1#mmConsignment
	 * TradeDelivery1.mmConsignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmRoutingSummary
	 * LineItemDetails4.mmRoutingSummary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmRoutingSummary
	 * LineItem5.mmRoutingSummary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmRoutingSummary
	 * LineItemDetails7.mmRoutingSummary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#mmRoutingSummary
	 * LineItem7.mmRoutingSummary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmTransport
	 * CertificateDataSet1.mmTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmRoutingSummary
	 * LineItem11.mmRoutingSummary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmRoutingSummary
	 * LineItemDetails10.mmRoutingSummary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmRoutingSummary
	 * LineItemDetails13.mmRoutingSummary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmRoutingSummary
	 * LineItem13.mmRoutingSummary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeDelivery2#mmConsignment
	 * TradeDelivery2.mmConsignment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Routing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the conveyance of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRouting = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradeDelivery1.mmConsignment, LineItemDetails4.mmRoutingSummary, LineItem5.mmRoutingSummary, LineItemDetails7.mmRoutingSummary, LineItem7.mmRoutingSummary, CertificateDataSet1.mmTransport,
					LineItem11.mmRoutingSummary, LineItemDetails10.mmRoutingSummary, LineItemDetails13.mmRoutingSummary, LineItem13.mmRoutingSummary, TradeDelivery2.mmConsignment);
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Routing";
			definition = "Information related to the conveyance of goods.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.mmProductDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
		}
	};
	protected CommercialTradeSettlement tradeSettlement;
	/**
	 * Specifies the settlement operation which originates the delivery of a
	 * product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmProductDelivery
	 * CommercialTradeSettlement.mmProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement operation which originates the delivery of a product."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the settlement operation which originates the delivery of a product.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmProductDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
		}
	};
	protected ProductDeliveryObligation obligation;
	/**
	 * Specifies the obligation which is offset by the delivery of a product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation#mmProductDeliveryOffset
	 * ProductDeliveryObligation.mmProductDeliveryOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ProductDeliveryObligation
	 * ProductDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the obligation which is offset by the delivery of a product."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the obligation which is offset by the delivery of a product.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.mmProductDeliveryOffset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDeliveryObligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TradeCertificate> tradeCertificate;
	/**
	 * Formal document used to record a fact and used as proof of the fact, in
	 * the context of a commercial trade transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradeCertificate#mmProductDelivery
	 * TradeCertificate.mmProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradeCertificate
	 * TradeCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradeCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeCertificate";
			definition = "Formal document used to record a fact and used as proof of the fact, in the context of a commercial trade transaction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmProductDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradeCertificate.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InsuranceCertificate> insuranceCertificate;
	/**
	 * Formal document used to record a fact and used as proof of the fact that
	 * goods have been insured under an insurance policy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate#mmProductDelivery
	 * InsuranceCertificate.mmProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InsuranceCertificate
	 * InsuranceCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInsuranceCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InsuranceCertificate";
			definition = "Formal document used to record a fact and used as proof of the fact that goods have been insured under an insurance policy.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmProductDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InsuranceCertificate.mmObject();
		}
	};
	protected Product product;
	/**
	 * Specifies the type of goods and services linked to the quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmDelivery
	 * Product.mmDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmCertifiedCharacteristics
	 * CertificateDataSet2.mmCertifiedCharacteristics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of goods and services linked to the quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CertificateDataSet2.mmCertifiedCharacteristics);
			elementContext_lazy = () -> ProductDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the type of goods and services linked to the quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductDelivery";
				definition = "Arrangements for delivery of invoiced products and/or services.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmRelatedProductDelivery, com.tools20022.repository.entity.Product.mmDelivery,
						com.tools20022.repository.entity.InsuranceCertificate.mmProductDelivery, com.tools20022.repository.entity.Transport.mmProductDelivery, com.tools20022.repository.entity.CommercialTradeSettlement.mmProductDelivery,
						com.tools20022.repository.entity.TradeCertificate.mmProductDelivery, com.tools20022.repository.entity.ProductDeliveryObligation.mmProductDeliveryOffset);
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(ProductDelivery.mmDeliveryPeriod, ProductDelivery.mmRouting, ProductDelivery.mmTradeSettlement, ProductDelivery.mmObligation, ProductDelivery.mmTradeCertificate,
						ProductDelivery.mmInsuranceCertificate, ProductDelivery.mmProduct);
				derivationComponent_lazy = () -> Arrays.asList(TradeDelivery1.mmObject(), TradeDelivery2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public DateTimePeriod getDeliveryPeriod() {
		return deliveryPeriod;
	}

	public void setDeliveryPeriod(com.tools20022.repository.entity.DateTimePeriod deliveryPeriod) {
		this.deliveryPeriod = deliveryPeriod;
	}

	public List<Transport> getRouting() {
		return routing;
	}

	public void setRouting(List<com.tools20022.repository.entity.Transport> routing) {
		this.routing = routing;
	}

	public CommercialTradeSettlement getTradeSettlement() {
		return tradeSettlement;
	}

	public void setTradeSettlement(com.tools20022.repository.entity.CommercialTradeSettlement tradeSettlement) {
		this.tradeSettlement = tradeSettlement;
	}

	public ProductDeliveryObligation getObligation() {
		return obligation;
	}

	public void setObligation(com.tools20022.repository.entity.ProductDeliveryObligation obligation) {
		this.obligation = obligation;
	}

	public List<TradeCertificate> getTradeCertificate() {
		return tradeCertificate;
	}

	public void setTradeCertificate(List<com.tools20022.repository.entity.TradeCertificate> tradeCertificate) {
		this.tradeCertificate = tradeCertificate;
	}

	public List<InsuranceCertificate> getInsuranceCertificate() {
		return insuranceCertificate;
	}

	public void setInsuranceCertificate(List<com.tools20022.repository.entity.InsuranceCertificate> insuranceCertificate) {
		this.insuranceCertificate = insuranceCertificate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(com.tools20022.repository.entity.Product product) {
		this.product = product;
	}
}