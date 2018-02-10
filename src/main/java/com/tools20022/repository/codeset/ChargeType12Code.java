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
import com.tools20022.repository.codeset.ChargeType12Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code#BackEndLoad
 * ChargeType12Code.BackEndLoad}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType12Code#Discount
 * ChargeType12Code.Discount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code#FrontEndLoad
 * ChargeType12Code.FrontEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code#PostageCharge
 * ChargeType12Code.PostageCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code#RegulatoryFee
 * ChargeType12Code.RegulatoryFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code#ShippingCharge
 * ChargeType12Code.ShippingCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code#SpecialConcessions
 * ChargeType12Code.SpecialConcessions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code#TransferFee
 * ChargeType12Code.TransferFee}</li>
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
 * <li>"BEND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeType12Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of service for which a charge is asked or paid."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeType12Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code
	 * ChargeType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * </ul>
	 */
	public static final ChargeType12Code BackEndLoad = new ChargeType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType12Code.mmObject();
			codeName = ChargeTypeCode.BackEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code
	 * ChargeType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * </ul>
	 */
	public static final ChargeType12Code Discount = new ChargeType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType12Code.mmObject();
			codeName = ChargeTypeCode.Discount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code
	 * ChargeType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoad"</li>
	 * </ul>
	 */
	public static final ChargeType12Code FrontEndLoad = new ChargeType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrontEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType12Code.mmObject();
			codeName = ChargeTypeCode.FrontEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code
	 * ChargeType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostageCharge"</li>
	 * </ul>
	 */
	public static final ChargeType12Code PostageCharge = new ChargeType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostageCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType12Code.mmObject();
			codeName = ChargeTypeCode.PostageCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code
	 * ChargeType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryFee"</li>
	 * </ul>
	 */
	public static final ChargeType12Code RegulatoryFee = new ChargeType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType12Code.mmObject();
			codeName = ChargeTypeCode.RegulatoryFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code
	 * ChargeType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShippingCharge"</li>
	 * </ul>
	 */
	public static final ChargeType12Code ShippingCharge = new ChargeType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShippingCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType12Code.mmObject();
			codeName = ChargeTypeCode.ShippingCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code
	 * ChargeType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConcessions"</li>
	 * </ul>
	 */
	public static final ChargeType12Code SpecialConcessions = new ChargeType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConcessions";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType12Code.mmObject();
			codeName = ChargeTypeCode.SpecialConcessions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType12Code
	 * ChargeType12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferFee"</li>
	 * </ul>
	 */
	public static final ChargeType12Code TransferFee = new ChargeType12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType12Code.mmObject();
			codeName = ChargeTypeCode.TransferFee.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeType12Code> codesByName = new LinkedHashMap<>();

	protected ChargeType12Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BEND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeType12Code";
				definition = "Type of service for which a charge is asked or paid.";
				trace_lazy = () -> ChargeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeType12Code.BackEndLoad, com.tools20022.repository.codeset.ChargeType12Code.Discount, com.tools20022.repository.codeset.ChargeType12Code.FrontEndLoad,
						com.tools20022.repository.codeset.ChargeType12Code.PostageCharge, com.tools20022.repository.codeset.ChargeType12Code.RegulatoryFee, com.tools20022.repository.codeset.ChargeType12Code.ShippingCharge,
						com.tools20022.repository.codeset.ChargeType12Code.SpecialConcessions, com.tools20022.repository.codeset.ChargeType12Code.TransferFee);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BackEndLoad.getCodeName().get(), BackEndLoad);
		codesByName.put(Discount.getCodeName().get(), Discount);
		codesByName.put(FrontEndLoad.getCodeName().get(), FrontEndLoad);
		codesByName.put(PostageCharge.getCodeName().get(), PostageCharge);
		codesByName.put(RegulatoryFee.getCodeName().get(), RegulatoryFee);
		codesByName.put(ShippingCharge.getCodeName().get(), ShippingCharge);
		codesByName.put(SpecialConcessions.getCodeName().get(), SpecialConcessions);
		codesByName.put(TransferFee.getCodeName().get(), TransferFee);
	}

	public static ChargeType12Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeType12Code[] values() {
		ChargeType12Code[] values = new ChargeType12Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeType12Code> {
		@Override
		public ChargeType12Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeType12Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}