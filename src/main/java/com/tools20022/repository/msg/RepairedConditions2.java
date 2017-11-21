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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Charge or commission of the original individual order details that have been
 * repaired so that the order can be accepted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepairedConditions2#mmRepairedCharge
 * RepairedConditions2.mmRepairedCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepairedConditions2#mmRepairedCommission
 * RepairedConditions2.mmRepairedCommission}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
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
 * "RepairedConditions2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Charge or commission of the original individual order details that have been repaired so that the order can be accepted."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RepairedConditions2", propOrder = {"repairedCharge", "repairedCommission"})
public class RepairedConditions2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.Charge11> repairedCharge;
	/**
	 * Charge from the original individual order details that has been repaired
	 * so that the order can be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge11 Charge11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepairedConditions2
	 * RepairedConditions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdChrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charge from the original individual order details that has been repaired so that the order can be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepairedCharge = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> RepairedConditions2.mmObject();
			isDerived = false;
			xmlTag = "RprdChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedCharge";
			definition = "Charge from the original individual order details that has been repaired so that the order can be accepted.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charge11.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Commission7> repairedCommission;
	/**
	 * Commission from the original individual order details that has been
	 * repaired so that the order can be accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission7
	 * Commission7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepairedConditions2
	 * RepairedConditions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprdComssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairedCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission from the original individual order details that has been repaired so that the order can be accepted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepairedCommission = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> RepairedConditions2.mmObject();
			isDerived = false;
			xmlTag = "RprdComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedCommission";
			definition = "Commission from the original individual order details that has been repaired so that the order can be accepted.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RepairedConditions2.mmRepairedCharge, RepairedConditions2.mmRepairedCommission);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepairedConditions2";
				definition = "Charge or commission of the original individual order details that have been repaired so that the order can be accepted.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RprdChrg")
	public List<Charge11> getRepairedCharge() {
		return repairedCharge;
	}

	public void setRepairedCharge(List<com.tools20022.repository.msg.Charge11> repairedCharge) {
		this.repairedCharge = repairedCharge;
	}

	@XmlElement(name = "RprdComssn")
	public List<Commission7> getRepairedCommission() {
		return repairedCommission;
	}

	public void setRepairedCommission(List<com.tools20022.repository.msg.Commission7> repairedCommission) {
		this.repairedCommission = repairedCommission;
	}
}