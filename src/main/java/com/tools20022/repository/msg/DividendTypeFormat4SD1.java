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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Extension to specify additional information related to the type of dividend.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DividendTypeFormat4SD1#mmPlaceAndName
 * DividendTypeFormat4SD1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DividendTypeFormat4SD1#mmProvisionalDividendFlag
 * DividendTypeFormat4SD1.mmProvisionalDividendFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DividendTypeFormat4SD1#mmCommemorativeDividendFlag
 * DividendTypeFormat4SD1.mmCommemorativeDividendFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DividendTypeFormat4SD1#mmSpecialDividendFlag
 * DividendTypeFormat4SD1.mmSpecialDividendFlag}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfProvisionalDividendFlagRule#forDividendTypeFormat4SD1
 * ConstraintUseOfProvisionalDividendFlagRule.forDividendTypeFormat4SD1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfCommemorativeDividendFlagRule#forDividendTypeFormat4SD1
 * ConstraintUseOfCommemorativeDividendFlagRule.forDividendTypeFormat4SD1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfSpecialDividendFlagRule#forDividendTypeFormat4SD1
 * ConstraintUseOfSpecialDividendFlagRule.forDividendTypeFormat4SD1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DividendTypeFormat4SD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Extension to specify additional information related to the type of dividend."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DividendTypeFormat4SD1", propOrder = {"placeAndName", "provisionalDividendFlag", "commemorativeDividendFlag", "specialDividendFlag"})
public class DividendTypeFormat4SD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DividendTypeFormat4SD1
	 * DividendTypeFormat4SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DividendTypeFormat4SD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "PrvsnlDvddFlg", required = true)
	protected YesNoIndicator provisionalDividendFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DividendTypeFormat4SD1
	 * DividendTypeFormat4SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsnlDvddFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvisionalDividendFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the dividend is provisional 予想区分.\r\nIf the value is No, then the dividend is actual.\r\nProvisionalDividendFlag can only be used with corporate action event type code DVCA."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProvisionalDividendFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DividendTypeFormat4SD1.mmObject();
			isDerived = false;
			xmlTag = "PrvsnlDvddFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvisionalDividendFlag";
			definition = "Specifies whether the dividend is provisional 予想区分.\r\nIf the value is No, then the dividend is actual.\r\nProvisionalDividendFlag can only be used with corporate action event type code DVCA.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "CommrtvDvddFlg", required = true)
	protected YesNoIndicator commemorativeDividendFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DividendTypeFormat4SD1
	 * DividendTypeFormat4SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CommrtvDvddFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommemorativeDividendFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the dividend includes commemorative dividend. 記念配当区分\r\nCommemorativeDividendFlag can only be used with corporate action event type code DVCA."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommemorativeDividendFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DividendTypeFormat4SD1.mmObject();
			isDerived = false;
			xmlTag = "CommrtvDvddFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommemorativeDividendFlag";
			definition = "Specifies whether the dividend includes commemorative dividend. 記念配当区分\r\nCommemorativeDividendFlag can only be used with corporate action event type code DVCA.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "SpclDvddFlg", required = true)
	protected YesNoIndicator specialDividendFlag;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DividendTypeFormat4SD1
	 * DividendTypeFormat4SD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpclDvddFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialDividendFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the dividend includes special dividend.\r\n特別配当区分\r\nSpecialDividendFlag can only be used with corporate action event type code DVCA."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSpecialDividendFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DividendTypeFormat4SD1.mmObject();
			isDerived = false;
			xmlTag = "SpclDvddFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialDividendFlag";
			definition = "Specifies whether the dividend includes special dividend.\r\n特別配当区分\r\nSpecialDividendFlag can only be used with corporate action event type code DVCA.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DividendTypeFormat4SD1.mmPlaceAndName, com.tools20022.repository.msg.DividendTypeFormat4SD1.mmProvisionalDividendFlag,
						com.tools20022.repository.msg.DividendTypeFormat4SD1.mmCommemorativeDividendFlag, com.tools20022.repository.msg.DividendTypeFormat4SD1.mmSpecialDividendFlag);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUseOfProvisionalDividendFlagRule.forDividendTypeFormat4SD1,
						com.tools20022.repository.constraints.ConstraintUseOfCommemorativeDividendFlagRule.forDividendTypeFormat4SD1, com.tools20022.repository.constraints.ConstraintUseOfSpecialDividendFlagRule.forDividendTypeFormat4SD1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DividendTypeFormat4SD1";
				definition = "Extension to specify additional information related to the type of dividend.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public DividendTypeFormat4SD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public YesNoIndicator getProvisionalDividendFlag() {
		return provisionalDividendFlag;
	}

	public DividendTypeFormat4SD1 setProvisionalDividendFlag(YesNoIndicator provisionalDividendFlag) {
		this.provisionalDividendFlag = Objects.requireNonNull(provisionalDividendFlag);
		return this;
	}

	public YesNoIndicator getCommemorativeDividendFlag() {
		return commemorativeDividendFlag;
	}

	public DividendTypeFormat4SD1 setCommemorativeDividendFlag(YesNoIndicator commemorativeDividendFlag) {
		this.commemorativeDividendFlag = Objects.requireNonNull(commemorativeDividendFlag);
		return this;
	}

	public YesNoIndicator getSpecialDividendFlag() {
		return specialDividendFlag;
	}

	public DividendTypeFormat4SD1 setSpecialDividendFlag(YesNoIndicator specialDividendFlag) {
		this.specialDividendFlag = Objects.requireNonNull(specialDividendFlag);
		return this;
	}
}