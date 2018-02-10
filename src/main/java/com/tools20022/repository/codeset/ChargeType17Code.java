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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ChargeType17Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of service for which a charge is asked or paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code#PostageCharge
 * ChargeType17Code.PostageCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code#RegulatoryFee
 * ChargeType17Code.RegulatoryFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code#ShippingCharge
 * ChargeType17Code.ShippingCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code#ServiceProvisionFee
 * ChargeType17Code.ServiceProvisionFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType17Code#Other
 * ChargeType17Code.Other}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType17Code#Premium
 * ChargeType17Code.Premium}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType17Code#Packaging
 * ChargeType17Code.Packaging}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType17Code#PickUp
 * ChargeType17Code.PickUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code#SecurityCharge
 * ChargeType17Code.SecurityCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code#InsurancePremium
 * ChargeType17Code.InsurancePremium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code#MiscellaneousFee
 * ChargeType17Code.MiscellaneousFee}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChargeTypeCode ChargeTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"POST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeType17Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of service for which a charge is asked or paid."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeType17Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code
	 * ChargeType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageCharge"</li>
	 * </ul>
	 */
	public static final ChargeType17Code PostageCharge = new ChargeType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType17Code.mmObject();
			codeName = ChargeTypeCode.PostageCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code
	 * ChargeType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryFee"</li>
	 * </ul>
	 */
	public static final ChargeType17Code RegulatoryFee = new ChargeType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType17Code.mmObject();
			codeName = ChargeTypeCode.RegulatoryFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code
	 * ChargeType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingCharge"</li>
	 * </ul>
	 */
	public static final ChargeType17Code ShippingCharge = new ChargeType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType17Code.mmObject();
			codeName = ChargeTypeCode.ShippingCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code
	 * ChargeType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceProvisionFee"</li>
	 * </ul>
	 */
	public static final ChargeType17Code ServiceProvisionFee = new ChargeType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceProvisionFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType17Code.mmObject();
			codeName = ChargeTypeCode.ServiceProvisionFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code
	 * ChargeType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final ChargeType17Code Other = new ChargeType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType17Code.mmObject();
			codeName = ChargeTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code
	 * ChargeType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * </ul>
	 */
	public static final ChargeType17Code Premium = new ChargeType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType17Code.mmObject();
			codeName = ChargeTypeCode.Premium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code
	 * ChargeType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Packaging"</li>
	 * </ul>
	 */
	public static final ChargeType17Code Packaging = new ChargeType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Packaging";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType17Code.mmObject();
			codeName = ChargeTypeCode.Packaging.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code
	 * ChargeType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUp"</li>
	 * </ul>
	 */
	public static final ChargeType17Code PickUp = new ChargeType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUp";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType17Code.mmObject();
			codeName = ChargeTypeCode.PickUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code
	 * ChargeType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCharge"</li>
	 * </ul>
	 */
	public static final ChargeType17Code SecurityCharge = new ChargeType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType17Code.mmObject();
			codeName = ChargeTypeCode.SecurityCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code
	 * ChargeType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsurancePremium"</li>
	 * </ul>
	 */
	public static final ChargeType17Code InsurancePremium = new ChargeType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsurancePremium";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType17Code.mmObject();
			codeName = ChargeTypeCode.InsurancePremium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType17Code
	 * ChargeType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousFee"</li>
	 * </ul>
	 */
	public static final ChargeType17Code MiscellaneousFee = new ChargeType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType17Code.mmObject();
			codeName = ChargeTypeCode.MiscellaneousFee.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeType17Code> codesByName = new LinkedHashMap<>();

	protected ChargeType17Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("POST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeType17Code";
				definition = "Type of service for which a charge is asked or paid.";
				trace_lazy = () -> ChargeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeType17Code.PostageCharge, com.tools20022.repository.codeset.ChargeType17Code.RegulatoryFee,
						com.tools20022.repository.codeset.ChargeType17Code.ShippingCharge, com.tools20022.repository.codeset.ChargeType17Code.ServiceProvisionFee, com.tools20022.repository.codeset.ChargeType17Code.Other,
						com.tools20022.repository.codeset.ChargeType17Code.Premium, com.tools20022.repository.codeset.ChargeType17Code.Packaging, com.tools20022.repository.codeset.ChargeType17Code.PickUp,
						com.tools20022.repository.codeset.ChargeType17Code.SecurityCharge, com.tools20022.repository.codeset.ChargeType17Code.InsurancePremium, com.tools20022.repository.codeset.ChargeType17Code.MiscellaneousFee);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PostageCharge.getCodeName().get(), PostageCharge);
		codesByName.put(RegulatoryFee.getCodeName().get(), RegulatoryFee);
		codesByName.put(ShippingCharge.getCodeName().get(), ShippingCharge);
		codesByName.put(ServiceProvisionFee.getCodeName().get(), ServiceProvisionFee);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Premium.getCodeName().get(), Premium);
		codesByName.put(Packaging.getCodeName().get(), Packaging);
		codesByName.put(PickUp.getCodeName().get(), PickUp);
		codesByName.put(SecurityCharge.getCodeName().get(), SecurityCharge);
		codesByName.put(InsurancePremium.getCodeName().get(), InsurancePremium);
		codesByName.put(MiscellaneousFee.getCodeName().get(), MiscellaneousFee);
	}

	public static ChargeType17Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeType17Code[] values() {
		ChargeType17Code[] values = new ChargeType17Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeType17Code> {
		@Override
		public ChargeType17Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeType17Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}