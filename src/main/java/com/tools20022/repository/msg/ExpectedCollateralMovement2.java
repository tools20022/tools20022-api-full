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
import com.tools20022.repository.entity.ExpectedCollateralType;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralMovement9;
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
 * Specifies the expected collateral type and direction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2#mmDelivery
 * ExpectedCollateralMovement2.mmDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2#mmReturn
 * ExpectedCollateralMovement2.mmReturn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
 * ExpectedCollateralType}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExpectedCollateralMovement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the expected collateral type and direction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1
 * ExpectedCollateralMovement1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExpectedCollateralMovement2", propOrder = {"delivery", "return_"})
public class ExpectedCollateralMovement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dlvry")
	protected List<CollateralMovement9> delivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement9
	 * CollateralMovement9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmDelivery
	 * ExpectedCollateralType.mmDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2
	 * ExpectedCollateralMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dlvry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of collateral that will be delivered and date by which the collateral movement is expected."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1#mmDelivery
	 * ExpectedCollateralMovement1.mmDelivery}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpectedCollateralMovement2, List<CollateralMovement9>> mmDelivery = new MMMessageAttribute<ExpectedCollateralMovement2, List<CollateralMovement9>>() {
		{
			businessElementTrace_lazy = () -> ExpectedCollateralType.mmDelivery;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpectedCollateralMovement2.mmObject();
			isDerived = false;
			xmlTag = "Dlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delivery";
			definition = "Type of collateral that will be delivered and date by which the collateral movement is expected.";
			previousVersion_lazy = () -> ExpectedCollateralMovement1.mmDelivery;
			minOccurs = 0;
			complexType_lazy = () -> CollateralMovement9.mmObject();
		}

		@Override
		public List<CollateralMovement9> getValue(ExpectedCollateralMovement2 obj) {
			return obj.getDelivery();
		}

		@Override
		public void setValue(ExpectedCollateralMovement2 obj, List<CollateralMovement9> value) {
			obj.setDelivery(value);
		}
	};
	@XmlElement(name = "Rtr")
	protected List<CollateralMovement9> return_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CollateralMovement9
	 * CollateralMovement9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmReturn
	 * ExpectedCollateralType.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2
	 * ExpectedCollateralMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Return"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of collateral that will be returned and date by which the collateral movement is expected."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1#mmReturn
	 * ExpectedCollateralMovement1.mmReturn}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExpectedCollateralMovement2, List<CollateralMovement9>> mmReturn = new MMMessageAttribute<ExpectedCollateralMovement2, List<CollateralMovement9>>() {
		{
			businessElementTrace_lazy = () -> ExpectedCollateralType.mmReturn;
			componentContext_lazy = () -> com.tools20022.repository.msg.ExpectedCollateralMovement2.mmObject();
			isDerived = false;
			xmlTag = "Rtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Return";
			definition = "Type of collateral that will be returned and date by which the collateral movement is expected.";
			previousVersion_lazy = () -> ExpectedCollateralMovement1.mmReturn;
			minOccurs = 0;
			complexType_lazy = () -> CollateralMovement9.mmObject();
		}

		@Override
		public List<CollateralMovement9> getValue(ExpectedCollateralMovement2 obj) {
			return obj.getReturn();
		}

		@Override
		public void setValue(ExpectedCollateralMovement2 obj, List<CollateralMovement9> value) {
			obj.setReturn(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExpectedCollateralMovement2.mmDelivery, com.tools20022.repository.msg.ExpectedCollateralMovement2.mmReturn);
				trace_lazy = () -> ExpectedCollateralType.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExpectedCollateralMovement2";
				definition = "Specifies the expected collateral type and direction.";
				previousVersion_lazy = () -> ExpectedCollateralMovement1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<CollateralMovement9> getDelivery() {
		return delivery == null ? delivery = new ArrayList<>() : delivery;
	}

	public ExpectedCollateralMovement2 setDelivery(List<CollateralMovement9> delivery) {
		this.delivery = Objects.requireNonNull(delivery);
		return this;
	}

	public List<CollateralMovement9> getReturn() {
		return return_ == null ? return_ = new ArrayList<>() : return_;
	}

	public ExpectedCollateralMovement2 setReturn(List<CollateralMovement9> return_) {
		this.return_ = Objects.requireNonNull(return_);
		return this;
	}
}