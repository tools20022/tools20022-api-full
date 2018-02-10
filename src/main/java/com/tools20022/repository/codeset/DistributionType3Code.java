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
import com.tools20022.repository.codeset.DistributionType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the proceeds of the event will be distributed on a rolling
 * basis rather than on a specific date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionType3Code#Final
 * DistributionType3Code.Final}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionType3Code#Interim
 * DistributionType3Code.Interim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionType3Code#Ongoing
 * DistributionType3Code.Ongoing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DistributionType3Code#RollingBasis
 * DistributionType3Code.RollingBasis}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DistributionTypeCode
 * DistributionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DistributionType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the proceeds of the event will be distributed on a rolling basis rather than on a specific date."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DistributionType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionType3Code
	 * DistributionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * </ul>
	 */
	public static final DistributionType3Code Final = new DistributionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionType3Code.mmObject();
			codeName = DistributionTypeCode.Final.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionType3Code
	 * DistributionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * </ul>
	 */
	public static final DistributionType3Code Interim = new DistributionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionType3Code.mmObject();
			codeName = DistributionTypeCode.Interim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionType3Code
	 * DistributionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ongoing"</li>
	 * </ul>
	 */
	public static final DistributionType3Code Ongoing = new DistributionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ongoing";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionType3Code.mmObject();
			codeName = DistributionTypeCode.Ongoing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionType3Code
	 * DistributionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RollingBasis"</li>
	 * </ul>
	 */
	public static final DistributionType3Code RollingBasis = new DistributionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RollingBasis";
			owner_lazy = () -> com.tools20022.repository.codeset.DistributionType3Code.mmObject();
			codeName = DistributionTypeCode.RollingBasis.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DistributionType3Code> codesByName = new LinkedHashMap<>();

	protected DistributionType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DistributionType3Code";
				definition = "Specifies whether the proceeds of the event will be distributed on a rolling basis rather than on a specific date.";
				trace_lazy = () -> DistributionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DistributionType3Code.Final, com.tools20022.repository.codeset.DistributionType3Code.Interim,
						com.tools20022.repository.codeset.DistributionType3Code.Ongoing, com.tools20022.repository.codeset.DistributionType3Code.RollingBasis);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Final.getCodeName().get(), Final);
		codesByName.put(Interim.getCodeName().get(), Interim);
		codesByName.put(Ongoing.getCodeName().get(), Ongoing);
		codesByName.put(RollingBasis.getCodeName().get(), RollingBasis);
	}

	public static DistributionType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DistributionType3Code[] values() {
		DistributionType3Code[] values = new DistributionType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DistributionType3Code> {
		@Override
		public DistributionType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DistributionType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}