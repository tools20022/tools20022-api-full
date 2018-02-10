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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SubBalanceQuantity3Choice;
import com.tools20022.repository.choice.SubBalanceType6Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Subbalances providing additional information on a specific position but that
 * is not to be accounted for in the building of the aggregate balance, for
 * example, registered.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6#mmSubBalanceType
 * AdditionalBalanceInformation6.mmSubBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6#mmQuantity
 * AdditionalBalanceInformation6.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6#mmSubBalanceAdditionalDetails
 * AdditionalBalanceInformation6.mmSubBalanceAdditionalDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule#forAdditionalBalanceInformation6
 * ConstraintSubBalanceAdditionalDetailsRule.forAdditionalBalanceInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEligibleForCollateralPurposesRule#forAdditionalBalanceInformation6
 * ConstraintEligibleForCollateralPurposesRule.forAdditionalBalanceInformation6}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forAdditionalBalanceInformation6
 * ConstraintCoexistenceQuantityRule.forAdditionalBalanceInformation6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalBalanceInformation6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Subbalances providing additional information on a specific position but that is not to be accounted for in the building of the aggregate balance, for example, registered."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14
 * AdditionalBalanceInformation14}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalBalanceInformation6", propOrder = {"subBalanceType", "quantity", "subBalanceAdditionalDetails"})
public class AdditionalBalanceInformation6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SubBalTp", required = true)
	protected SubBalanceType6Choice subBalanceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceType6Choice
	 * SubBalanceType6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6
	 * AdditionalBalanceInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubBalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the sub-balance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14#mmSubBalanceType
	 * AdditionalBalanceInformation14.mmSubBalanceType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubBalanceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalBalanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "SubBalTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceType";
			definition = "Reason for the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBalanceInformation14.mmSubBalanceType);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SubBalanceType6Choice.mmObject();
		}
	};
	@XmlElement(name = "Qty", required = true)
	protected SubBalanceQuantity3Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SubBalanceQuantity3Choice
	 * SubBalanceQuantity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSubBalanceQuantity
	 * SecuritiesBalance.mmSubBalanceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6
	 * AdditionalBalanceInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of securities in the sub-balance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14#mmQuantity
	 * AdditionalBalanceInformation14.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSubBalanceQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalBalanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of securities in the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBalanceInformation14.mmQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SubBalanceQuantity3Choice.mmObject();
		}
	};
	@XmlElement(name = "SubBalAddtlDtls")
	protected Max140Text subBalanceAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation6
	 * AdditionalBalanceInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubBalAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70C::SUBB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubBalanceAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional subbalance information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation14#mmSubBalanceAdditionalDetails
	 * AdditionalBalanceInformation14.mmSubBalanceAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubBalanceAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalBalanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "SubBalAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70C::SUBB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubBalanceAdditionalDetails";
			definition = "Provides additional subbalance information.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalBalanceInformation14.mmSubBalanceAdditionalDetails);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalBalanceInformation6.mmSubBalanceType, com.tools20022.repository.msg.AdditionalBalanceInformation6.mmQuantity,
						com.tools20022.repository.msg.AdditionalBalanceInformation6.mmSubBalanceAdditionalDetails);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubBalanceAdditionalDetailsRule.forAdditionalBalanceInformation6,
						com.tools20022.repository.constraints.ConstraintEligibleForCollateralPurposesRule.forAdditionalBalanceInformation6,
						com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forAdditionalBalanceInformation6);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AdditionalBalanceInformation6";
				definition = "Subbalances providing additional information on a specific position but that is not to be accounted for in the building of the aggregate balance, for example, registered.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalBalanceInformation14.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SubBalanceType6Choice getSubBalanceType() {
		return subBalanceType;
	}

	public AdditionalBalanceInformation6 setSubBalanceType(SubBalanceType6Choice subBalanceType) {
		this.subBalanceType = Objects.requireNonNull(subBalanceType);
		return this;
	}

	public SubBalanceQuantity3Choice getQuantity() {
		return quantity;
	}

	public AdditionalBalanceInformation6 setQuantity(SubBalanceQuantity3Choice quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public Optional<Max140Text> getSubBalanceAdditionalDetails() {
		return subBalanceAdditionalDetails == null ? Optional.empty() : Optional.of(subBalanceAdditionalDetails);
	}

	public AdditionalBalanceInformation6 setSubBalanceAdditionalDetails(Max140Text subBalanceAdditionalDetails) {
		this.subBalanceAdditionalDetails = subBalanceAdditionalDetails;
		return this;
	}
}