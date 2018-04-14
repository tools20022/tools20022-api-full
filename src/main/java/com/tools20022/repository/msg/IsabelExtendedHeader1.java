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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.datatype.Max3Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IsabelSEPAFile1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the extended parameters for an Isabel payment file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1#mmSEPA
 * IsabelExtendedHeader1.mmSEPA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1#mmBPNFinancialInstitution
 * IsabelExtendedHeader1.mmBPNFinancialInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1#mmBICFinancialInstitution
 * IsabelExtendedHeader1.mmBICFinancialInstitution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelExtendedHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the extended parameters for an Isabel payment file."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelExtendedHeader1", propOrder = {"sEPA", "bPNFinancialInstitution", "bICFinancialInstitution"})
public class IsabelExtendedHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SEPA")
	protected IsabelSEPAFile1 sEPA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelSEPAFile1
	 * IsabelSEPAFile1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1
	 * IsabelExtendedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SEPA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SEPA related information for a payment file."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelExtendedHeader1, Optional<IsabelSEPAFile1>> mmSEPA = new MMMessageAssociationEnd<IsabelExtendedHeader1, Optional<IsabelSEPAFile1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelExtendedHeader1.mmObject();
			isDerived = false;
			xmlTag = "SEPA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEPA";
			definition = "SEPA related information for a payment file.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IsabelSEPAFile1.mmObject();
		}

		@Override
		public Optional<IsabelSEPAFile1> getValue(IsabelExtendedHeader1 obj) {
			return obj.getSEPA();
		}

		@Override
		public void setValue(IsabelExtendedHeader1 obj, Optional<IsabelSEPAFile1> value) {
			obj.setSEPA(value.orElse(null));
		}
	};
	@XmlElement(name = "BPNFI")
	protected Max3Text bPNFinancialInstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Text
	 * Max3Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1
	 * IsabelExtendedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BPNFI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BPNFinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Belgian bank protocol number (BPN) of the receiving bank."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelExtendedHeader1, Optional<Max3Text>> mmBPNFinancialInstitution = new MMMessageAttribute<IsabelExtendedHeader1, Optional<Max3Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelExtendedHeader1.mmObject();
			isDerived = false;
			xmlTag = "BPNFI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BPNFinancialInstitution";
			definition = "Belgian bank protocol number (BPN) of the receiving bank.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Text.mmObject();
		}

		@Override
		public Optional<Max3Text> getValue(IsabelExtendedHeader1 obj) {
			return obj.getBPNFinancialInstitution();
		}

		@Override
		public void setValue(IsabelExtendedHeader1 obj, Optional<Max3Text> value) {
			obj.setBPNFinancialInstitution(value.orElse(null));
		}
	};
	@XmlElement(name = "BICFI")
	protected BICFIIdentifier bICFinancialInstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelExtendedHeader1
	 * IsabelExtendedHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BICFI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICFinancialInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Business identification code of the receiving bank."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelExtendedHeader1, Optional<BICFIIdentifier>> mmBICFinancialInstitution = new MMMessageAttribute<IsabelExtendedHeader1, Optional<BICFIIdentifier>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelExtendedHeader1.mmObject();
			isDerived = false;
			xmlTag = "BICFI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BICFinancialInstitution";
			definition = "Business identification code of the receiving bank.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}

		@Override
		public Optional<BICFIIdentifier> getValue(IsabelExtendedHeader1 obj) {
			return obj.getBICFinancialInstitution();
		}

		@Override
		public void setValue(IsabelExtendedHeader1 obj, Optional<BICFIIdentifier> value) {
			obj.setBICFinancialInstitution(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelExtendedHeader1.mmSEPA, com.tools20022.repository.msg.IsabelExtendedHeader1.mmBPNFinancialInstitution,
						com.tools20022.repository.msg.IsabelExtendedHeader1.mmBICFinancialInstitution);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelExtendedHeader1";
				definition = "Specifies the extended parameters for an Isabel payment file.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<IsabelSEPAFile1> getSEPA() {
		return sEPA == null ? Optional.empty() : Optional.of(sEPA);
	}

	public IsabelExtendedHeader1 setSEPA(IsabelSEPAFile1 sEPA) {
		this.sEPA = sEPA;
		return this;
	}

	public Optional<Max3Text> getBPNFinancialInstitution() {
		return bPNFinancialInstitution == null ? Optional.empty() : Optional.of(bPNFinancialInstitution);
	}

	public IsabelExtendedHeader1 setBPNFinancialInstitution(Max3Text bPNFinancialInstitution) {
		this.bPNFinancialInstitution = bPNFinancialInstitution;
		return this;
	}

	public Optional<BICFIIdentifier> getBICFinancialInstitution() {
		return bICFinancialInstitution == null ? Optional.empty() : Optional.of(bICFinancialInstitution);
	}

	public IsabelExtendedHeader1 setBICFinancialInstitution(BICFIIdentifier bICFinancialInstitution) {
		this.bICFinancialInstitution = bICFinancialInstitution;
		return this;
	}
}