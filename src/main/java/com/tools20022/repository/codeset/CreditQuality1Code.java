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
import com.tools20022.repository.codeset.CreditQuality1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Assessment of the credit quality of a party or financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code#DefaultImminent
 * CreditQuality1Code.DefaultImminent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code#ExtremelySpeculative
 * CreditQuality1Code.ExtremelySpeculative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code#HighGrade
 * CreditQuality1Code.HighGrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code#HighlySpeculative
 * CreditQuality1Code.HighlySpeculative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code#InDefault
 * CreditQuality1Code.InDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code#LowerMediumGrade
 * CreditQuality1Code.LowerMediumGrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code#NonInvestmentGradeSpeculative
 * CreditQuality1Code.NonInvestmentGradeSpeculative}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CreditQuality1Code#Prime
 * CreditQuality1Code.Prime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code#SubstantialRisk
 * CreditQuality1Code.SubstantialRisk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code#UpperMediumGrade
 * CreditQuality1Code.UpperMediumGrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CreditQualityCode
 * CreditQualityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreditQuality1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Assessment of the credit quality of a party or financial instrument."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CreditQuality1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code
	 * CreditQuality1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultImminent"</li>
	 * </ul>
	 */
	public static final CreditQuality1Code DefaultImminent = new CreditQuality1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultImminent";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQuality1Code.mmObject();
			codeName = CreditQualityCode.DefaultImminent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code
	 * CreditQuality1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtremelySpeculative"</li>
	 * </ul>
	 */
	public static final CreditQuality1Code ExtremelySpeculative = new CreditQuality1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtremelySpeculative";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQuality1Code.mmObject();
			codeName = CreditQualityCode.ExtremelySpeculative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code
	 * CreditQuality1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighGrade"</li>
	 * </ul>
	 */
	public static final CreditQuality1Code HighGrade = new CreditQuality1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighGrade";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQuality1Code.mmObject();
			codeName = CreditQualityCode.HighGrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code
	 * CreditQuality1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighlySpeculative"</li>
	 * </ul>
	 */
	public static final CreditQuality1Code HighlySpeculative = new CreditQuality1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighlySpeculative";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQuality1Code.mmObject();
			codeName = CreditQualityCode.HighlySpeculative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code
	 * CreditQuality1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InDefault"</li>
	 * </ul>
	 */
	public static final CreditQuality1Code InDefault = new CreditQuality1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InDefault";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQuality1Code.mmObject();
			codeName = CreditQualityCode.InDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code
	 * CreditQuality1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LowerMediumGrade"</li>
	 * </ul>
	 */
	public static final CreditQuality1Code LowerMediumGrade = new CreditQuality1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LowerMediumGrade";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQuality1Code.mmObject();
			codeName = CreditQualityCode.LowerMediumGrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code
	 * CreditQuality1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonInvestmentGradeSpeculative"</li>
	 * </ul>
	 */
	public static final CreditQuality1Code NonInvestmentGradeSpeculative = new CreditQuality1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonInvestmentGradeSpeculative";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQuality1Code.mmObject();
			codeName = CreditQualityCode.NonInvestmentGradeSpeculative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code
	 * CreditQuality1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prime"</li>
	 * </ul>
	 */
	public static final CreditQuality1Code Prime = new CreditQuality1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prime";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQuality1Code.mmObject();
			codeName = CreditQualityCode.Prime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code
	 * CreditQuality1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstantialRisk"</li>
	 * </ul>
	 */
	public static final CreditQuality1Code SubstantialRisk = new CreditQuality1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstantialRisk";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQuality1Code.mmObject();
			codeName = CreditQualityCode.SubstantialRisk.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditQuality1Code
	 * CreditQuality1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpperMediumGrade"</li>
	 * </ul>
	 */
	public static final CreditQuality1Code UpperMediumGrade = new CreditQuality1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpperMediumGrade";
			owner_lazy = () -> com.tools20022.repository.codeset.CreditQuality1Code.mmObject();
			codeName = CreditQualityCode.UpperMediumGrade.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CreditQuality1Code> codesByName = new LinkedHashMap<>();

	protected CreditQuality1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CreditQuality1Code";
				definition = "Assessment of the credit quality of a party or financial instrument.";
				trace_lazy = () -> CreditQualityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CreditQuality1Code.DefaultImminent, com.tools20022.repository.codeset.CreditQuality1Code.ExtremelySpeculative,
						com.tools20022.repository.codeset.CreditQuality1Code.HighGrade, com.tools20022.repository.codeset.CreditQuality1Code.HighlySpeculative, com.tools20022.repository.codeset.CreditQuality1Code.InDefault,
						com.tools20022.repository.codeset.CreditQuality1Code.LowerMediumGrade, com.tools20022.repository.codeset.CreditQuality1Code.NonInvestmentGradeSpeculative, com.tools20022.repository.codeset.CreditQuality1Code.Prime,
						com.tools20022.repository.codeset.CreditQuality1Code.SubstantialRisk, com.tools20022.repository.codeset.CreditQuality1Code.UpperMediumGrade);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DefaultImminent.getCodeName().get(), DefaultImminent);
		codesByName.put(ExtremelySpeculative.getCodeName().get(), ExtremelySpeculative);
		codesByName.put(HighGrade.getCodeName().get(), HighGrade);
		codesByName.put(HighlySpeculative.getCodeName().get(), HighlySpeculative);
		codesByName.put(InDefault.getCodeName().get(), InDefault);
		codesByName.put(LowerMediumGrade.getCodeName().get(), LowerMediumGrade);
		codesByName.put(NonInvestmentGradeSpeculative.getCodeName().get(), NonInvestmentGradeSpeculative);
		codesByName.put(Prime.getCodeName().get(), Prime);
		codesByName.put(SubstantialRisk.getCodeName().get(), SubstantialRisk);
		codesByName.put(UpperMediumGrade.getCodeName().get(), UpperMediumGrade);
	}

	public static CreditQuality1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CreditQuality1Code[] values() {
		CreditQuality1Code[] values = new CreditQuality1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CreditQuality1Code> {
		@Override
		public CreditQuality1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CreditQuality1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}