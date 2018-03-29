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
import com.tools20022.repository.msg.Charge19;
import com.tools20022.repository.msg.Commission11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.msg.RepairedConditions3#mmRepairedCharge
 * RepairedConditions3.mmRepairedCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepairedConditions3#mmRepairedCommission
 * RepairedConditions3.mmRepairedCommission}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
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
 * "RepairedConditions3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Charge or commission of the original individual order details that have been repaired so that the order can be accepted."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RepairedConditions3", propOrder = {"repairedCharge", "repairedCommission"})
public class RepairedConditions3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RprdChrg")
	protected List<Charge19> repairedCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge19 Charge19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepairedConditions3
	 * RepairedConditions3}</li>
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
	 * "Modified value of the charge applied on the order (the charge in the original individual order that has been repaired so that the order can be accepted)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RepairedConditions3, List<Charge19>> mmRepairedCharge = new MMMessageAssociationEnd<RepairedConditions3, List<Charge19>>() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RepairedConditions3.mmObject();
			isDerived = false;
			xmlTag = "RprdChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedCharge";
			definition = "Modified value of the charge applied on the order (the charge in the original individual order that has been repaired so that the order can be accepted).";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge19.mmObject();
		}

		@Override
		public List<Charge19> getValue(RepairedConditions3 obj) {
			return obj.getRepairedCharge();
		}

		@Override
		public void setValue(RepairedConditions3 obj, List<Charge19> value) {
			obj.setRepairedCharge(value);
		}
	};
	@XmlElement(name = "RprdComssn")
	protected List<Commission11> repairedCommission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission11
	 * Commission11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepairedConditions3
	 * RepairedConditions3}</li>
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
	 * "Modified value of the commission applied on the order (the commission in the original individual order that has been repaired so that the order can be accepted)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RepairedConditions3, List<Commission11>> mmRepairedCommission = new MMMessageAssociationEnd<RepairedConditions3, List<Commission11>>() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RepairedConditions3.mmObject();
			isDerived = false;
			xmlTag = "RprdComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairedCommission";
			definition = "Modified value of the commission applied on the order (the commission in the original individual order that has been repaired so that the order can be accepted).";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Commission11.mmObject();
		}

		@Override
		public List<Commission11> getValue(RepairedConditions3 obj) {
			return obj.getRepairedCommission();
		}

		@Override
		public void setValue(RepairedConditions3 obj, List<Commission11> value) {
			obj.setRepairedCommission(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RepairedConditions3.mmRepairedCharge, com.tools20022.repository.msg.RepairedConditions3.mmRepairedCommission);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepairedConditions3";
				definition = "Charge or commission of the original individual order details that have been repaired so that the order can be accepted.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Charge19> getRepairedCharge() {
		return repairedCharge == null ? repairedCharge = new ArrayList<>() : repairedCharge;
	}

	public RepairedConditions3 setRepairedCharge(List<Charge19> repairedCharge) {
		this.repairedCharge = Objects.requireNonNull(repairedCharge);
		return this;
	}

	public List<Commission11> getRepairedCommission() {
		return repairedCommission == null ? repairedCommission = new ArrayList<>() : repairedCommission;
	}

	public RepairedConditions3 setRepairedCommission(List<Commission11> repairedCommission) {
		this.repairedCommission = Objects.requireNonNull(repairedCommission);
		return this;
	}
}