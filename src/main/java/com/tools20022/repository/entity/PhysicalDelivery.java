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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.PhysicalTransferTypeCode;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.DeliveryParameters2;
import com.tools20022.repository.msg.DeliveryParameters3;
import com.tools20022.repository.msg.DeliveryParameters4;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#RelatedTransfer
 * PhysicalDelivery.RelatedTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#RegisteredAddressIndicator
 * PhysicalDelivery.RegisteredAddressIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#IssuedCertificateNumber
 * PhysicalDelivery.IssuedCertificateNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhysicalDelivery#Address
 * PhysicalDelivery.Address}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PhysicalDelivery#Type
 * PhysicalDelivery.Type}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PostalAddress#PhysicalDelivery
 * PostalAddress.PhysicalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#PhysicalDelivery
 * SecuritiesTransfer.PhysicalDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#RelatedDelivery
 * SecuritiesCertificate.RelatedDelivery}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Transfer process which requires physical delivery of the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#PhysicalDelivery
	 * SecuritiesTransfer.PhysicalDelivery}</li>
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
	public static final MMBusinessAssociationEnd RelatedTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransfer";
			definition = "Transfer process which requires physical delivery of the securities.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.PhysicalDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters2#RegisteredAddressIndicator
	 * DeliveryParameters2.RegisteredAddressIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters4#RegisteredAddressIndicator
	 * DeliveryParameters4.RegisteredAddressIndicator}</li>
	 * </ul>
	 * </li>
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
	 * name} = "RegisteredAddressIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the address for the physical delivery is the registered address."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RegisteredAddressIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveryParameters2.RegisteredAddressIndicator, com.tools20022.repository.msg.DeliveryParameters4.RegisteredAddressIndicator);
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegisteredAddressIndicator";
			definition = "Indicates whether the address for the physical delivery is the registered address.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Certificate representing a security that is delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#RelatedDelivery
	 * SecuritiesCertificate.RelatedDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate
	 * SecuritiesCertificate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters3#IssuedCertificateNumber
	 * DeliveryParameters3.IssuedCertificateNumber}</li>
	 * </ul>
	 * </li>
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
	 * name} = "IssuedCertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate representing a security that is delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IssuedCertificateNumber = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveryParameters3.IssuedCertificateNumber);
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuedCertificateNumber";
			definition = "Certificate representing a security that is delivered.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesCertificate.RelatedDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Address for physical delivery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress#PhysicalDelivery
	 * PostalAddress.PhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PostalAddress
	 * PostalAddress}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveryParameters3#Address
	 * DeliveryParameters3.Address}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#PhysicalDeliveryDetails
	 * SubscriptionOrder3.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder5#PhysicalDeliveryDetails
	 * SubscriptionOrder5.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder7#PhysicalDeliveryDetails
	 * SubscriptionOrder7.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder4#PhysicalDeliveryDetails
	 * SubscriptionOrder4.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder6#PhysicalDeliveryDetails
	 * SubscriptionOrder6.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder8#PhysicalDeliveryDetails
	 * SubscriptionOrder8.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2#PhysicalDeliveryDetails
	 * SwitchSubscriptionLegOrder2.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3#PhysicalDeliveryDetails
	 * SwitchSubscriptionLegOrder3.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6#PhysicalDeliveryDetails
	 * SwitchSubscriptionLegOrder6.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder15#PhysicalDeliveryDetails
	 * SubscriptionOrder15.PhysicalDeliveryDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder14#PhysicalDeliveryDetails
	 * SubscriptionOrder14.PhysicalDeliveryDetails}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Address"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address for physical delivery."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Address = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveryParameters3.Address, com.tools20022.repository.msg.SubscriptionOrder3.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SubscriptionOrder5.PhysicalDeliveryDetails, com.tools20022.repository.msg.SubscriptionOrder7.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SubscriptionOrder4.PhysicalDeliveryDetails, com.tools20022.repository.msg.SubscriptionOrder6.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SubscriptionOrder8.PhysicalDeliveryDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder2.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SwitchSubscriptionLegOrder3.PhysicalDeliveryDetails, com.tools20022.repository.msg.SwitchSubscriptionLegOrder6.PhysicalDeliveryDetails,
					com.tools20022.repository.msg.SubscriptionOrder15.PhysicalDeliveryDetails, com.tools20022.repository.msg.SubscriptionOrder14.PhysicalDeliveryDetails);
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Address";
			definition = "Address for physical delivery.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PostalAddress.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PostalAddress.PhysicalDelivery;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#PhysicalTransfer
	 * DeliverInformation7.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#PhysicalTransfer
	 * ReceiveInformation8.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#PhysicalTransfer
	 * ReceiveInformation6.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#PhysicalTransfer
	 * ReceiveInformation11.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#PhysicalTransfer
	 * DeliverInformation11.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#PhysicalTransfer
	 * DeliverInformation8.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#PhysicalTransfer
	 * ReceiveInformation7.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#PhysicalTransfer
	 * ReceiveInformation5.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#PhysicalTransfer
	 * ReceiveInformation9.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#PhysicalTransfer
	 * DeliverInformation5.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#PhysicalTransfer
	 * DeliverInformation9.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#PhysicalTransfer
	 * DeliverInformation6.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#PhysicalTransfer
	 * ReceiveInformation13.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#PhysicalTransfer
	 * ReceiveInformation12.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#PhysicalTransfer
	 * DeliverInformation12.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#PhysicalTransfer
	 * DeliverInformation13.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#PhysicalTransfer
	 * DeliverInformation15.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#PhysicalTransfer
	 * DeliverInformation14.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#PhysicalTransfer
	 * ReceiveInformation15.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#PhysicalTransfer
	 * ReceiveInformation14.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance1#HoldingPhysicalType
	 * AggregateHoldingBalance1.HoldingPhysicalType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#PhysicalTransfer
	 * ReceiveInformation17.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#PhysicalTransfer
	 * ReceiveInformation16.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#PhysicalTransfer
	 * DeliverInformation16.PhysicalTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#PhysicalTransfer
	 * DeliverInformation17.PhysicalTransfer}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of delivery."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation7.PhysicalTransfer, com.tools20022.repository.msg.ReceiveInformation8.PhysicalTransfer,
					com.tools20022.repository.msg.ReceiveInformation6.PhysicalTransfer, com.tools20022.repository.msg.ReceiveInformation11.PhysicalTransfer, com.tools20022.repository.msg.DeliverInformation11.PhysicalTransfer,
					com.tools20022.repository.msg.DeliverInformation8.PhysicalTransfer, com.tools20022.repository.msg.ReceiveInformation7.PhysicalTransfer, com.tools20022.repository.msg.ReceiveInformation5.PhysicalTransfer,
					com.tools20022.repository.msg.ReceiveInformation9.PhysicalTransfer, com.tools20022.repository.msg.DeliverInformation5.PhysicalTransfer, com.tools20022.repository.msg.DeliverInformation9.PhysicalTransfer,
					com.tools20022.repository.msg.DeliverInformation6.PhysicalTransfer, com.tools20022.repository.msg.ReceiveInformation13.PhysicalTransfer, com.tools20022.repository.msg.ReceiveInformation12.PhysicalTransfer,
					com.tools20022.repository.msg.DeliverInformation12.PhysicalTransfer, com.tools20022.repository.msg.DeliverInformation13.PhysicalTransfer, com.tools20022.repository.msg.DeliverInformation15.PhysicalTransfer,
					com.tools20022.repository.msg.DeliverInformation14.PhysicalTransfer, com.tools20022.repository.msg.ReceiveInformation15.PhysicalTransfer, com.tools20022.repository.msg.ReceiveInformation14.PhysicalTransfer,
					com.tools20022.repository.msg.AggregateHoldingBalance1.HoldingPhysicalType, com.tools20022.repository.msg.ReceiveInformation17.PhysicalTransfer, com.tools20022.repository.msg.ReceiveInformation16.PhysicalTransfer,
					com.tools20022.repository.msg.DeliverInformation16.PhysicalTransfer, com.tools20022.repository.msg.DeliverInformation17.PhysicalTransfer);
			elementContext_lazy = () -> PhysicalDelivery.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of delivery.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PhysicalTransferTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PhysicalDelivery";
				definition = "Parameters of a physical delivery.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PostalAddress.PhysicalDelivery, com.tools20022.repository.entity.SecuritiesTransfer.PhysicalDelivery,
						com.tools20022.repository.entity.SecuritiesCertificate.RelatedDelivery);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PhysicalDelivery.RelatedTransfer, com.tools20022.repository.entity.PhysicalDelivery.RegisteredAddressIndicator,
						com.tools20022.repository.entity.PhysicalDelivery.IssuedCertificateNumber, com.tools20022.repository.entity.PhysicalDelivery.Address, com.tools20022.repository.entity.PhysicalDelivery.Type);
				derivationComponent_lazy = () -> Arrays.asList(DeliveryParameters2.mmObject(), DeliveryParameters4.mmObject(), DeliveryParameters3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}