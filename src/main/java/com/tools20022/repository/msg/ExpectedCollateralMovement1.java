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
import com.tools20022.repository.codeset.CollateralType1Code;
import com.tools20022.repository.entity.ExpectedCollateralType;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1#mmDelivery
 * ExpectedCollateralMovement1.mmDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1#mmReturn
 * ExpectedCollateralMovement1.mmReturn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ExpectedCollateralType
 * ExpectedCollateralType}</li>
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
 * "ExpectedCollateralMovement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the expected collateral type and direction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2
 * ExpectedCollateralMovement2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ExpectedCollateralMovement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CollateralType1Code> delivery;
	/**
	 * Type of collateral that will be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType1Code
	 * CollateralType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmDelivery
	 * ExpectedCollateralType.mmDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1
	 * ExpectedCollateralMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dlvry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of collateral that will be delivered."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2#mmDelivery
	 * ExpectedCollateralMovement2.mmDelivery}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDelivery = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExpectedCollateralType.mmDelivery;
			componentContext_lazy = () -> ExpectedCollateralMovement1.mmObject();
			isDerived = false;
			xmlTag = "Dlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delivery";
			definition = "Type of collateral that will be delivered.";
			nextVersions_lazy = () -> Arrays.asList(ExpectedCollateralMovement2.mmDelivery);
			minOccurs = 0;
			simpleType_lazy = () -> CollateralType1Code.mmObject();
		}
	};
	protected List<CollateralType1Code> return_;
	/**
	 * Type of collateral that will be returned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType1Code
	 * CollateralType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExpectedCollateralType#mmReturn
	 * ExpectedCollateralType.mmReturn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement1
	 * ExpectedCollateralMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Return"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of collateral that will be returned."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExpectedCollateralMovement2#mmReturn
	 * ExpectedCollateralMovement2.mmReturn}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReturn = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ExpectedCollateralType.mmReturn;
			componentContext_lazy = () -> ExpectedCollateralMovement1.mmObject();
			isDerived = false;
			xmlTag = "Rtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Return";
			definition = "Type of collateral that will be returned.";
			nextVersions_lazy = () -> Arrays.asList(ExpectedCollateralMovement2.mmReturn);
			minOccurs = 0;
			simpleType_lazy = () -> CollateralType1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ExpectedCollateralMovement1.mmDelivery, ExpectedCollateralMovement1.mmReturn);
				trace_lazy = () -> ExpectedCollateralType.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExpectedCollateralMovement1";
				definition = "Specifies the expected collateral type and direction.";
				nextVersions_lazy = () -> Arrays.asList(ExpectedCollateralMovement2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<CollateralType1Code> getDelivery() {
		return delivery;
	}

	public void setDelivery(List<CollateralType1Code> delivery) {
		this.delivery = delivery;
	}

	public List<CollateralType1Code> getReturn() {
		return return_;
	}

	public void setReturn(List<CollateralType1Code> return_) {
		this.return_ = return_;
	}
}