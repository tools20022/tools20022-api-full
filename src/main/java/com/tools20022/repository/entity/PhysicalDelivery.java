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
import com.tools20022.repository.codeset.PhysicalTransferTypeCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters of a physical delivery.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PhysicalDelivery" src="doc-files/PhysicalDelivery.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveryParameters2
 * DeliveryParameters2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveryParameters4
 * DeliveryParameters4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveryParameters3
 * DeliveryParameters3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPhysicalDelivery
 * PostalAddress.mmPhysicalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
 * SecuritiesTransfer.mmPhysicalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmRelatedDelivery
 * SecuritiesCertificate.mmRelatedDelivery}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmRelatedTransfer
 * PhysicalDelivery.mmRelatedTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmRegisteredAddressIndicator
 * PhysicalDelivery.mmRegisteredAddressIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmIssuedCertificateNumber
 * PhysicalDelivery.mmIssuedCertificateNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmAddress
 * PhysicalDelivery.mmAddress}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmType
 * PhysicalDelivery.mmType}</li>
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
 * "PhysicalDelivery"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters of a physical delivery."</li>
 * </ul>
 */
public class PhysicalDelivery {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesTransfer relatedTransfer;
	/**
	 * Transfer process which requires physical delivery of the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
	 * SecuritiesTransfer.mmPhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer process which requires physical delivery of the securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransfer";
			definition = "Transfer process which requires physical delivery of the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmPhysicalDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected YesNoIndicator registeredAddressIndicator;
	/**
	 * Indicates whether the address for the physical delivery is the registered
	 * address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters2#mmRegisteredAddressIndicator
	 * DeliveryParameters2.mmRegisteredAddressIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters4#mmRegisteredAddressIndicator
	 * DeliveryParameters4.mmRegisteredAddressIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredAddressIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the address for the physical delivery is the registered address."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegisteredAddressIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DeliveryParameters2.mmRegisteredAddressIndicator, DeliveryParameters4.mmRegisteredAddressIndicator);
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RegisteredAddressIndicator";
			definition = "Indicates whether the address for the physical delivery is the registered address.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SecuritiesCertificate issuedCertificateNumber;
	/**
	 * Certificate representing a security that is delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmRelatedDelivery
	 * SecuritiesCertificate.mmRelatedDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters3#mmIssuedCertificateNumber
	 * DeliveryParameters3.mmIssuedCertificateNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuedCertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate representing a security that is delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIssuedCertificateNumber = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(DeliveryParameters3.mmIssuedCertificateNumber);
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuedCertificateNumber";
			definition = "Certificate representing a security that is delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmRelatedDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.mmObject();
		}
	};
	protected PostalAddress address;
	/**
	 * Address for physical delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#mmPhysicalDelivery
	 * PostalAddress.mmPhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PostalAddress
	 * PostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters3#mmAddress
	 * DeliveryParameters3.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmPhysicalDeliveryDetails
	 * SubscriptionOrder3.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#mmPhysicalDeliveryDetails
	 * SubscriptionOrder5.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#mmPhysicalDeliveryDetails
	 * SubscriptionOrder7.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#mmPhysicalDeliveryDetails
	 * SubscriptionOrder4.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#mmPhysicalDeliveryDetails
	 * SubscriptionOrder6.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#mmPhysicalDeliveryDetails
	 * SubscriptionOrder8.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#mmPhysicalDeliveryDetails
	 * SwitchSubscriptionLegOrder2.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#mmPhysicalDeliveryDetails
	 * SwitchSubscriptionLegOrder3.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#mmPhysicalDeliveryDetails
	 * SwitchSubscriptionLegOrder6.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#mmPhysicalDeliveryDetails
	 * SubscriptionOrder15.mmPhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#mmPhysicalDeliveryDetails
	 * SubscriptionOrder14.mmPhysicalDeliveryDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Address"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for physical delivery."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAddress = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(DeliveryParameters3.mmAddress, SubscriptionOrder3.mmPhysicalDeliveryDetails, SubscriptionOrder5.mmPhysicalDeliveryDetails, SubscriptionOrder7.mmPhysicalDeliveryDetails,
					SubscriptionOrder4.mmPhysicalDeliveryDetails, SubscriptionOrder6.mmPhysicalDeliveryDetails, SubscriptionOrder8.mmPhysicalDeliveryDetails, SwitchSubscriptionLegOrder2.mmPhysicalDeliveryDetails,
					SwitchSubscriptionLegOrder3.mmPhysicalDeliveryDetails, SwitchSubscriptionLegOrder6.mmPhysicalDeliveryDetails, SubscriptionOrder15.mmPhysicalDeliveryDetails, SubscriptionOrder14.mmPhysicalDeliveryDetails);
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Address";
			definition = "Address for physical delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmPhysicalDelivery;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PostalAddress.mmObject();
		}
	};
	protected PhysicalTransferTypeCode type;
	/**
	 * Specifies the type of delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PhysicalTransferTypeCode
	 * PhysicalTransferTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery
	 * PhysicalDelivery}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#mmPhysicalTransfer
	 * DeliverInformation7.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#mmPhysicalTransfer
	 * ReceiveInformation8.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#mmPhysicalTransfer
	 * ReceiveInformation6.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#mmPhysicalTransfer
	 * ReceiveInformation11.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#mmPhysicalTransfer
	 * DeliverInformation11.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#mmPhysicalTransfer
	 * DeliverInformation8.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#mmPhysicalTransfer
	 * ReceiveInformation7.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#mmPhysicalTransfer
	 * ReceiveInformation5.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmPhysicalTransfer
	 * ReceiveInformation9.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#mmPhysicalTransfer
	 * DeliverInformation5.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmPhysicalTransfer
	 * DeliverInformation9.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#mmPhysicalTransfer
	 * DeliverInformation6.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmPhysicalTransfer
	 * ReceiveInformation13.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmPhysicalTransfer
	 * ReceiveInformation12.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmPhysicalTransfer
	 * DeliverInformation12.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmPhysicalTransfer
	 * DeliverInformation13.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmPhysicalTransfer
	 * DeliverInformation15.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmPhysicalTransfer
	 * DeliverInformation14.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmPhysicalTransfer
	 * ReceiveInformation15.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmPhysicalTransfer
	 * ReceiveInformation14.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#mmHoldingPhysicalType
	 * AggregateHoldingBalance1.mmHoldingPhysicalType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmPhysicalTransfer
	 * ReceiveInformation17.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmPhysicalTransfer
	 * ReceiveInformation16.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmPhysicalTransfer
	 * DeliverInformation16.mmPhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmPhysicalTransfer
	 * DeliverInformation17.mmPhysicalTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of delivery."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DeliverInformation7.mmPhysicalTransfer, ReceiveInformation8.mmPhysicalTransfer, ReceiveInformation6.mmPhysicalTransfer, ReceiveInformation11.mmPhysicalTransfer,
					DeliverInformation11.mmPhysicalTransfer, DeliverInformation8.mmPhysicalTransfer, ReceiveInformation7.mmPhysicalTransfer, ReceiveInformation5.mmPhysicalTransfer, ReceiveInformation9.mmPhysicalTransfer,
					DeliverInformation5.mmPhysicalTransfer, DeliverInformation9.mmPhysicalTransfer, DeliverInformation6.mmPhysicalTransfer, ReceiveInformation13.mmPhysicalTransfer, ReceiveInformation12.mmPhysicalTransfer,
					DeliverInformation12.mmPhysicalTransfer, DeliverInformation13.mmPhysicalTransfer, DeliverInformation15.mmPhysicalTransfer, DeliverInformation14.mmPhysicalTransfer, ReceiveInformation15.mmPhysicalTransfer,
					ReceiveInformation14.mmPhysicalTransfer, AggregateHoldingBalance1.mmHoldingPhysicalType, ReceiveInformation17.mmPhysicalTransfer, ReceiveInformation16.mmPhysicalTransfer, DeliverInformation16.mmPhysicalTransfer,
					DeliverInformation17.mmPhysicalTransfer);
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of delivery.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PhysicalTransferTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PhysicalDelivery";
				definition = "Parameters of a physical delivery.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.mmPhysicalDelivery, com.tools20022.repository.entity.SecuritiesTransfer.mmPhysicalDelivery,
						com.tools20022.repository.entity.SecuritiesCertificate.mmRelatedDelivery);
				element_lazy = () -> Arrays.asList(PhysicalDelivery.mmRelatedTransfer, PhysicalDelivery.mmRegisteredAddressIndicator, PhysicalDelivery.mmIssuedCertificateNumber, PhysicalDelivery.mmAddress, PhysicalDelivery.mmType);
				derivationComponent_lazy = () -> Arrays.asList(DeliveryParameters2.mmObject(), DeliveryParameters4.mmObject(), DeliveryParameters3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTransfer getRelatedTransfer() {
		return relatedTransfer;
	}

	public void setRelatedTransfer(com.tools20022.repository.entity.SecuritiesTransfer relatedTransfer) {
		this.relatedTransfer = relatedTransfer;
	}

	public YesNoIndicator getRegisteredAddressIndicator() {
		return registeredAddressIndicator;
	}

	public void setRegisteredAddressIndicator(YesNoIndicator registeredAddressIndicator) {
		this.registeredAddressIndicator = registeredAddressIndicator;
	}

	public SecuritiesCertificate getIssuedCertificateNumber() {
		return issuedCertificateNumber;
	}

	public void setIssuedCertificateNumber(com.tools20022.repository.entity.SecuritiesCertificate issuedCertificateNumber) {
		this.issuedCertificateNumber = issuedCertificateNumber;
	}

	public PostalAddress getAddress() {
		return address;
	}

	public void setAddress(com.tools20022.repository.entity.PostalAddress address) {
		this.address = address;
	}

	public PhysicalTransferTypeCode getType() {
		return type;
	}

	public void setType(PhysicalTransferTypeCode type) {
		this.type = type;
	}
}