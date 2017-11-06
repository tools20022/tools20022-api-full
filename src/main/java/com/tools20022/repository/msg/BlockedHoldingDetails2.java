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
import com.tools20022.repository.codeset.Holding1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundClass;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information about a blocked holding.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2#mmBlockedHolding
 * BlockedHoldingDetails2.mmBlockedHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2#mmPartialHoldingUnits
 * BlockedHoldingDetails2.mmPartialHoldingUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2#mmHoldingCertificateNumber
 * BlockedHoldingDetails2.mmHoldingCertificateNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
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
 * "BlockedHoldingDetails2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a blocked holding."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1
 * BlockedHoldingDetails1}</li>
 * </ul>
 */
public class BlockedHoldingDetails2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Holding1Code blockedHolding;
	/**
	 * Specifies how the blocked account holding is defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Holding1Code
	 * Holding1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2
	 * BlockedHoldingDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdHldg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how the blocked account holding is defined."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1#mmBlockedHolding
	 * BlockedHoldingDetails1.mmBlockedHolding}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBlockedHolding = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> BlockedHoldingDetails2.mmObject();
			isDerived = false;
			xmlTag = "BlckdHldg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedHolding";
			definition = "Specifies how the blocked account holding is defined.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BlockedHoldingDetails1.mmBlockedHolding;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Holding1Code.mmObject();
		}
	};
	protected DecimalNumber partialHoldingUnits;
	/**
	 * When an account is blocked at the level of fund or security, partially,
	 * this is the number of units blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2
	 * BlockedHoldingDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlHldgUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialHoldingUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When an account is blocked at the level of fund or security, partially, this is the number of units blocked."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1#mmPartialHoldingUnits
	 * BlockedHoldingDetails1.mmPartialHoldingUnits}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialHoldingUnits = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> BlockedHoldingDetails2.mmObject();
			isDerived = false;
			xmlTag = "PrtlHldgUnits";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialHoldingUnits";
			definition = "When an account is blocked at the level of fund or security, partially, this is the number of units blocked.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BlockedHoldingDetails1.mmPartialHoldingUnits;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected Max35Text holdingCertificateNumber;
	/**
	 * When an account is blocked at the level of fund or security, this
	 * specifies the certificate number of the blocked units.
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
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2
	 * BlockedHoldingDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgCertNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingCertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When an account is blocked at the level of fund or security, this specifies the certificate number of the blocked units."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1#mmHoldingCertificateNumber
	 * BlockedHoldingDetails1.mmHoldingCertificateNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingCertificateNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentification;
			componentContext_lazy = () -> BlockedHoldingDetails2.mmObject();
			isDerived = false;
			xmlTag = "HldgCertNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingCertificateNumber";
			definition = "When an account is blocked at the level of fund or security, this specifies the certificate number of the blocked units.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BlockedHoldingDetails1.mmHoldingCertificateNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BlockedHoldingDetails2.mmBlockedHolding, com.tools20022.repository.msg.BlockedHoldingDetails2.mmPartialHoldingUnits,
						com.tools20022.repository.msg.BlockedHoldingDetails2.mmHoldingCertificateNumber);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BlockedHoldingDetails2";
				definition = "Information about a blocked holding.";
				previousVersion_lazy = () -> BlockedHoldingDetails1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Holding1Code getBlockedHolding() {
		return blockedHolding;
	}

	public void setBlockedHolding(Holding1Code blockedHolding) {
		this.blockedHolding = blockedHolding;
	}

	public DecimalNumber getPartialHoldingUnits() {
		return partialHoldingUnits;
	}

	public void setPartialHoldingUnits(DecimalNumber partialHoldingUnits) {
		this.partialHoldingUnits = partialHoldingUnits;
	}

	public Max35Text getHoldingCertificateNumber() {
		return holdingCertificateNumber;
	}

	public void setHoldingCertificateNumber(Max35Text holdingCertificateNumber) {
		this.holdingCertificateNumber = holdingCertificateNumber;
	}
}