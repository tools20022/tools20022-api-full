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
import com.tools20022.repository.codeset.LimitType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of risk management limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType4Code#ExternalGuarantee
 * LimitType4Code.ExternalGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType4Code#UnsecuredCredit
 * LimitType4Code.UnsecuredCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LimitType4Code#AutoCollateralisation
 * LimitType4Code.AutoCollateralisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LimitTypeCode LimitTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EXGT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of risk management limit."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LimitType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType4Code
	 * LimitType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalGuarantee"</li>
	 * </ul>
	 */
	public static final LimitType4Code ExternalGuarantee = new LimitType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalGuarantee";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType4Code.mmObject();
			codeName = LimitTypeCode.ExternalGuarantee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType4Code
	 * LimitType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsecuredCredit"</li>
	 * </ul>
	 */
	public static final LimitType4Code UnsecuredCredit = new LimitType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsecuredCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType4Code.mmObject();
			codeName = LimitTypeCode.UnsecuredCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType4Code
	 * LimitType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoCollateralisation"</li>
	 * </ul>
	 */
	public static final LimitType4Code AutoCollateralisation = new LimitType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.LimitType4Code.mmObject();
			codeName = LimitTypeCode.AutoCollateralisation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LimitType4Code> codesByName = new LinkedHashMap<>();

	protected LimitType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXGT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LimitType4Code";
				definition = "Specifies the type of risk management limit.";
				trace_lazy = () -> LimitTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LimitType4Code.ExternalGuarantee, com.tools20022.repository.codeset.LimitType4Code.UnsecuredCredit,
						com.tools20022.repository.codeset.LimitType4Code.AutoCollateralisation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ExternalGuarantee.getCodeName().get(), ExternalGuarantee);
		codesByName.put(UnsecuredCredit.getCodeName().get(), UnsecuredCredit);
		codesByName.put(AutoCollateralisation.getCodeName().get(), AutoCollateralisation);
	}

	public static LimitType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LimitType4Code[] values() {
		LimitType4Code[] values = new LimitType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LimitType4Code> {
		@Override
		public LimitType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LimitType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}