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
import com.tools20022.repository.area.reda.StandingSettlementInstructionCancellationV01;
import com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01;
import com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01;
import com.tools20022.repository.area.reda.StandingSettlementInstructionV01;
import com.tools20022.repository.codeset.ExternalEffectiveDateParameter1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Date and date parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EffectiveDate1#mmEffectiveDate
 * EffectiveDate1.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EffectiveDate1#mmEffectiveDateParameter
 * EffectiveDate1.mmEffectiveDateParameter}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#mmEffectiveDateDetails
 * StandingSettlementInstructionV01.mmEffectiveDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionCancellationV01#mmEffectiveDateDetails
 * StandingSettlementInstructionCancellationV01.mmEffectiveDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#mmEffectiveDateDetails
 * StandingSettlementInstructionStatusAdviceV01.mmEffectiveDateDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01#mmEffectiveDateDetails
 * StandingSettlementInstructionDeletionV01.mmEffectiveDateDetails}</li>
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
 * "EffectiveDate1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Date and date parameters."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "EffectiveDate1", propOrder = {"effectiveDate", "effectiveDateParameter"})
public class EffectiveDate1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODate effectiveDate;
	/**
	 * Date on which the SSI is effective. If the SSI is effective on a future
	 * date, then the date must be provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EffectiveDate1 EffectiveDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the SSI is effective. If the SSI is effective on a future date, then the date must be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EffectiveDate1.mmObject();
			isDerived = false;
			xmlTag = "FctvDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date on which the SSI is effective. If the SSI is effective on a future date, then the date must be provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ExternalEffectiveDateParameter1Code effectiveDateParameter;
	/**
	 * Specifies how the SSI update effective date is to be applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalEffectiveDateParameter1Code
	 * ExternalEffectiveDateParameter1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EffectiveDate1 EffectiveDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvDtParam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDateParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the SSI update effective date is to be applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveDateParameter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> EffectiveDate1.mmObject();
			isDerived = false;
			xmlTag = "FctvDtParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDateParameter";
			definition = "Specifies how the SSI update effective date is to be applied.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalEffectiveDateParameter1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(EffectiveDate1.mmEffectiveDate, EffectiveDate1.mmEffectiveDateParameter);
				messageBuildingBlock_lazy = () -> Arrays.asList(StandingSettlementInstructionV01.mmEffectiveDateDetails, StandingSettlementInstructionCancellationV01.mmEffectiveDateDetails,
						StandingSettlementInstructionStatusAdviceV01.mmEffectiveDateDetails, StandingSettlementInstructionDeletionV01.mmEffectiveDateDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EffectiveDate1";
				definition = "Date and date parameters.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "FctvDt", required = true)
	public ISODate getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(ISODate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	@XmlElement(name = "FctvDtParam")
	public ExternalEffectiveDateParameter1Code getEffectiveDateParameter() {
		return effectiveDateParameter;
	}

	public void setEffectiveDateParameter(ExternalEffectiveDateParameter1Code effectiveDateParameter) {
		this.effectiveDateParameter = effectiveDateParameter;
	}
}