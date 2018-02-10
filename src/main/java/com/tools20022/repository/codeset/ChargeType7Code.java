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
import com.tools20022.repository.codeset.ChargeType7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of service for which a charge is asked or paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code#ManagementFee
 * ChargeType7Code.ManagementFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code#BackEndLoad
 * ChargeType7Code.BackEndLoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code#AdvisoryFee
 * ChargeType7Code.AdvisoryFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType7Code#CustodyFee
 * ChargeType7Code.CustodyFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code#PublicationFee
 * ChargeType7Code.PublicationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code#AccountingFee
 * ChargeType7Code.AccountingFee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeType7Code#Other
 * ChargeType7Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code#Equalisation
 * ChargeType7Code.Equalisation}</li>
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
 * <li>"MANF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeType7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of service for which a charge is asked or paid."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeType7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code
	 * ChargeType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementFee"</li>
	 * </ul>
	 */
	public static final ChargeType7Code ManagementFee = new ChargeType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManagementFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType7Code.mmObject();
			codeName = ChargeTypeCode.ManagementFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code
	 * ChargeType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoad"</li>
	 * </ul>
	 */
	public static final ChargeType7Code BackEndLoad = new ChargeType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackEndLoad";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType7Code.mmObject();
			codeName = ChargeTypeCode.BackEndLoad.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code
	 * ChargeType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvisoryFee"</li>
	 * </ul>
	 */
	public static final ChargeType7Code AdvisoryFee = new ChargeType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisoryFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType7Code.mmObject();
			codeName = ChargeTypeCode.AdvisoryFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code
	 * ChargeType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyFee"</li>
	 * </ul>
	 */
	public static final ChargeType7Code CustodyFee = new ChargeType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType7Code.mmObject();
			codeName = ChargeTypeCode.CustodyFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code
	 * ChargeType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicationFee"</li>
	 * </ul>
	 */
	public static final ChargeType7Code PublicationFee = new ChargeType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicationFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType7Code.mmObject();
			codeName = ChargeTypeCode.PublicationFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code
	 * ChargeType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountingFee"</li>
	 * </ul>
	 */
	public static final ChargeType7Code AccountingFee = new ChargeType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountingFee";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType7Code.mmObject();
			codeName = ChargeTypeCode.AccountingFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code
	 * ChargeType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final ChargeType7Code Other = new ChargeType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType7Code.mmObject();
			codeName = ChargeTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeType7Code
	 * ChargeType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * </ul>
	 */
	public static final ChargeType7Code Equalisation = new ChargeType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeType7Code.mmObject();
			codeName = ChargeTypeCode.Equalisation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeType7Code> codesByName = new LinkedHashMap<>();

	protected ChargeType7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MANF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeType7Code";
				definition = "Specifies the type of service for which a charge is asked or paid.";
				trace_lazy = () -> ChargeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeType7Code.ManagementFee, com.tools20022.repository.codeset.ChargeType7Code.BackEndLoad, com.tools20022.repository.codeset.ChargeType7Code.AdvisoryFee,
						com.tools20022.repository.codeset.ChargeType7Code.CustodyFee, com.tools20022.repository.codeset.ChargeType7Code.PublicationFee, com.tools20022.repository.codeset.ChargeType7Code.AccountingFee,
						com.tools20022.repository.codeset.ChargeType7Code.Other, com.tools20022.repository.codeset.ChargeType7Code.Equalisation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ManagementFee.getCodeName().get(), ManagementFee);
		codesByName.put(BackEndLoad.getCodeName().get(), BackEndLoad);
		codesByName.put(AdvisoryFee.getCodeName().get(), AdvisoryFee);
		codesByName.put(CustodyFee.getCodeName().get(), CustodyFee);
		codesByName.put(PublicationFee.getCodeName().get(), PublicationFee);
		codesByName.put(AccountingFee.getCodeName().get(), AccountingFee);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Equalisation.getCodeName().get(), Equalisation);
	}

	public static ChargeType7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeType7Code[] values() {
		ChargeType7Code[] values = new ChargeType7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeType7Code> {
		@Override
		public ChargeType7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeType7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}