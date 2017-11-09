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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Ratio of the American or Global Depository Receipt(s) per ordinary share(s).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD2#mmReceiptBaseQuantity
 * CorporateActionRateSD2.mmReceiptBaseQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD2#mmOrdinaryShare
 * CorporateActionRateSD2.mmOrdinaryShare}</li>
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
 * "CorporateActionRateSD2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Ratio of the American or Global Depository Receipt(s) per ordinary share(s)."
 * </li>
 * </ul>
 */
public class CorporateActionRateSD2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DecimalNumber receiptBaseQuantity;
	/**
	 * Receipts quantity (base) of the American or Global Depository Receipt(s)
	 * per ordinary share(s) ratio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD2
	 * CorporateActionRateSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RctBaseQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiptBaseQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Receipts quantity (base) of the American or Global Depository Receipt(s) per ordinary share(s) ratio."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceiptBaseQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionRateSD2.mmObject();
			isDerived = false;
			xmlTag = "RctBaseQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiptBaseQuantity";
			definition = "Receipts quantity (base) of the American or Global Depository Receipt(s) per ordinary share(s) ratio.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected DecimalNumber ordinaryShare;
	/**
	 * Ordinary shares quantity of the American or Global Depository Receipt(s)
	 * per ordinary share(s) ratio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRateSD2
	 * CorporateActionRateSD2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdnryShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrdinaryShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * " Ordinary shares quantity of the American or Global Depository Receipt(s) per ordinary share(s)  ratio."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrdinaryShare = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionRateSD2.mmObject();
			isDerived = false;
			xmlTag = "OrdnryShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrdinaryShare";
			definition = " Ordinary shares quantity of the American or Global Depository Receipt(s) per ordinary share(s)  ratio.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionRateSD2.mmReceiptBaseQuantity, CorporateActionRateSD2.mmOrdinaryShare);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRateSD2";
				definition = "Ratio of the American or Global Depository Receipt(s) per ordinary share(s).";
			}
		});
		return mmObject_lazy.get();
	}

	public DecimalNumber getReceiptBaseQuantity() {
		return receiptBaseQuantity;
	}

	public void setReceiptBaseQuantity(DecimalNumber receiptBaseQuantity) {
		this.receiptBaseQuantity = receiptBaseQuantity;
	}

	public DecimalNumber getOrdinaryShare() {
		return ordinaryShare;
	}

	public void setOrdinaryShare(DecimalNumber ordinaryShare) {
		this.ordinaryShare = ordinaryShare;
	}
}