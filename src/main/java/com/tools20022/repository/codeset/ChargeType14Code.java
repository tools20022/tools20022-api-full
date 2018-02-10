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
import com.tools20022.repository.codeset.ChargeType14Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies charges linked to the type of service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType14Code#ADRFee
 * ChargeType14Code.ADRFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType14Code#IssuanceCancellationFee
 * ChargeType14Code.IssuanceCancellationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType14Code#CustodyFee
 * ChargeType14Code.CustodyFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType14Code#ServiceProvisionFee
 * ChargeType14Code.ServiceProvisionFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType14Code#MiscellaneousFee
 * ChargeType14Code.MiscellaneousFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType14Code#IssuanceFee
 * ChargeType14Code.IssuanceFee}</li>
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
 * <li>"ADRF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeType14Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies charges linked to the type of service."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeType14Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType14Code
	 * ChargeType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADRFee"</li>
	 * </ul>
	 */
	public static final ChargeType14Code ADRFee = new ChargeType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADRFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType14Code.mmObject();
			codeName = ChargeTypeCode.ADRFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType14Code
	 * ChargeType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceCancellationFee"</li>
	 * </ul>
	 */
	public static final ChargeType14Code IssuanceCancellationFee = new ChargeType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceCancellationFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType14Code.mmObject();
			codeName = ChargeTypeCode.IssuanceCancellationFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType14Code
	 * ChargeType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyFee"</li>
	 * </ul>
	 */
	public static final ChargeType14Code CustodyFee = new ChargeType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType14Code.mmObject();
			codeName = ChargeTypeCode.CustodyFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType14Code
	 * ChargeType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceProvisionFee"</li>
	 * </ul>
	 */
	public static final ChargeType14Code ServiceProvisionFee = new ChargeType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceProvisionFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType14Code.mmObject();
			codeName = ChargeTypeCode.ServiceProvisionFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType14Code
	 * ChargeType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiscellaneousFee"</li>
	 * </ul>
	 */
	public static final ChargeType14Code MiscellaneousFee = new ChargeType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiscellaneousFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType14Code.mmObject();
			codeName = ChargeTypeCode.MiscellaneousFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType14Code
	 * ChargeType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceFee"</li>
	 * </ul>
	 */
	public static final ChargeType14Code IssuanceFee = new ChargeType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType14Code.mmObject();
			codeName = ChargeTypeCode.IssuanceFee.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeType14Code> codesByName = new LinkedHashMap<>();

	protected ChargeType14Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADRF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeType14Code";
				definition = "Identifies charges linked to the type of service.";
				trace_lazy = () -> ChargeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeType14Code.ADRFee, com.tools20022.repository.codeset.ChargeType14Code.IssuanceCancellationFee,
						com.tools20022.repository.codeset.ChargeType14Code.CustodyFee, com.tools20022.repository.codeset.ChargeType14Code.ServiceProvisionFee, com.tools20022.repository.codeset.ChargeType14Code.MiscellaneousFee,
						com.tools20022.repository.codeset.ChargeType14Code.IssuanceFee);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ADRFee.getCodeName().get(), ADRFee);
		codesByName.put(IssuanceCancellationFee.getCodeName().get(), IssuanceCancellationFee);
		codesByName.put(CustodyFee.getCodeName().get(), CustodyFee);
		codesByName.put(ServiceProvisionFee.getCodeName().get(), ServiceProvisionFee);
		codesByName.put(MiscellaneousFee.getCodeName().get(), MiscellaneousFee);
		codesByName.put(IssuanceFee.getCodeName().get(), IssuanceFee);
	}

	public static ChargeType14Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeType14Code[] values() {
		ChargeType14Code[] values = new ChargeType14Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeType14Code> {
		@Override
		public ChargeType14Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeType14Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}