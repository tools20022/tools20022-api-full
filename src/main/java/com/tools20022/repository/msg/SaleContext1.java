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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max2NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Sale context in which the transaction is performed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmSaleIdentification
 * SaleContext1.mmSaleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmSaleReferenceNumber
 * SaleContext1.mmSaleReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmSaleReconciliationIdentification
 * SaleContext1.mmSaleReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmCashierIdentification
 * SaleContext1.mmCashierIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SaleContext1#mmShiftNumber
 * SaleContext1.mmShiftNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmAdditionalSaleData
 * SaleContext1.mmAdditionalSaleData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
 * CardPaymentAcquiring}</li>
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
 * "SaleContext1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Sale context in which the transaction is performed."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class SaleContext1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text saleIdentification;
	/**
	 * Identification of the sale terminal (electronic cash register) or the
	 * sale system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1 SaleContext1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the sale terminal (electronic cash register) or the sale system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmSaleIdentification
	 * SaleContext2.mmSaleIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSaleIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SaleContext1.mmObject();
			isDerived = false;
			xmlTag = "SaleId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleIdentification";
			definition = "Identification of the sale terminal (electronic cash register) or the sale system.";
			nextVersions_lazy = () -> Arrays.asList(SaleContext2.mmSaleIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text saleReferenceNumber;
	/**
	 * Identify a sale transaction assigned by the sale system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1 SaleContext1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identify a sale transaction assigned by the sale system."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmSaleReferenceNumber
	 * SaleContext2.mmSaleReferenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSaleReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SaleContext1.mmObject();
			isDerived = false;
			xmlTag = "SaleRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReferenceNumber";
			definition = "Identify a sale transaction assigned by the sale system.";
			nextVersions_lazy = () -> Arrays.asList(SaleContext2.mmSaleReferenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text saleReconciliationIdentification;
	/**
	 * Identifier of the reconciliation between the Sale system and the POI
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1 SaleContext1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of the reconciliation between the Sale system and the POI system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmSaleReconciliationIdentification
	 * SaleContext2.mmSaleReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSaleReconciliationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SaleContext1.mmObject();
			isDerived = false;
			xmlTag = "SaleRcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReconciliationIdentification";
			definition = "Identifier of the reconciliation between the Sale system and the POI system.";
			nextVersions_lazy = () -> Arrays.asList(SaleContext2.mmSaleReconciliationIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text cashierIdentification;
	/**
	 * Identification of the cashier who carried out the transaction.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1 SaleContext1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashierIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the cashier who carried out the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmCashierIdentification
	 * SaleContext2.mmCashierIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashierIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> SaleContext1.mmObject();
			isDerived = false;
			xmlTag = "CshrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashierIdentification";
			definition = "Identification of the cashier who carried out the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SaleContext2.mmCashierIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max2NumericText shiftNumber;
	/**
	 * Identifies the shift of the cashier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max2NumericText
	 * Max2NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1 SaleContext1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShftNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShiftNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the shift of the cashier."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SaleContext2#mmShiftNumber
	 * SaleContext2.mmShiftNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShiftNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SaleContext1.mmObject();
			isDerived = false;
			xmlTag = "ShftNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShiftNumber";
			definition = "Identifies the shift of the cashier.";
			nextVersions_lazy = () -> Arrays.asList(SaleContext2.mmShiftNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2NumericText.mmObject();
		}
	};
	protected Max70Text additionalSaleData;
	/**
	 * Additional information associated with the sale transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1 SaleContext1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSaleData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalSaleData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information associated with the sale transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmAdditionalSaleData
	 * SaleContext2.mmAdditionalSaleData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalSaleData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SaleContext1.mmObject();
			isDerived = false;
			xmlTag = "AddtlSaleData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalSaleData";
			definition = "Additional information associated with the sale transaction.";
			nextVersions_lazy = () -> Arrays.asList(SaleContext2.mmAdditionalSaleData);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SaleContext1.mmSaleIdentification, SaleContext1.mmSaleReferenceNumber, SaleContext1.mmSaleReconciliationIdentification, SaleContext1.mmCashierIdentification,
						SaleContext1.mmShiftNumber, SaleContext1.mmAdditionalSaleData);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SaleContext1";
				definition = "Sale context in which the transaction is performed.";
				nextVersions_lazy = () -> Arrays.asList(SaleContext2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getSaleIdentification() {
		return saleIdentification;
	}

	public void setSaleIdentification(Max35Text saleIdentification) {
		this.saleIdentification = saleIdentification;
	}

	public Max35Text getSaleReferenceNumber() {
		return saleReferenceNumber;
	}

	public void setSaleReferenceNumber(Max35Text saleReferenceNumber) {
		this.saleReferenceNumber = saleReferenceNumber;
	}

	public Max35Text getSaleReconciliationIdentification() {
		return saleReconciliationIdentification;
	}

	public void setSaleReconciliationIdentification(Max35Text saleReconciliationIdentification) {
		this.saleReconciliationIdentification = saleReconciliationIdentification;
	}

	public Max35Text getCashierIdentification() {
		return cashierIdentification;
	}

	public void setCashierIdentification(Max35Text cashierIdentification) {
		this.cashierIdentification = cashierIdentification;
	}

	public Max2NumericText getShiftNumber() {
		return shiftNumber;
	}

	public void setShiftNumber(Max2NumericText shiftNumber) {
		this.shiftNumber = shiftNumber;
	}

	public Max70Text getAdditionalSaleData() {
		return additionalSaleData;
	}

	public void setAdditionalSaleData(Max70Text additionalSaleData) {
		this.additionalSaleData = additionalSaleData;
	}
}